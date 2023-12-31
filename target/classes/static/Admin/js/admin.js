var app = angular.module('myApp', []);

app.controller('adproCtrl', function($scope, $http) {
	$scope.tablecheck = false;
	$scope.listproduct = [];
	$scope.lisypeoductype = [];
	$scope.Products = {
		id: null,
		name: '',
		price: 0.0,
		quantity: 0,
		image: '',
		contents: '',
		deletestatus: false,
		datecreate: new Date(),
		categories: {},
		list_order_detail: null
	};

	(

		loadFile = function(event) {
			var reader = new FileReader();
			reader.onload = function() {
				var output = document.getElementById('imageInput');
				output.src = reader.result;
			}
			/*var file = document.querySelector('#file-input-upload');*/
			$scope.Products.image = event.target.files[0].name;
			/*console.log(event.target.files[0]);*/
			reader.readAsDataURL(event.target.files[0]);
		}
	)


	$scope.updateProduct = function() {
		$http.post("/admin/api/updateproduct", $scope.Products).then(function(response) {
			$scope.loadproduct();
			$scope.editproduct(null);
		}, function(response) {
		});
	$scope.upload();
	};

	$scope.upload = function() {
		const fileInput = document.querySelector('#fileInput');
		var formdata = new FormData();
		formdata.append("file", fileInput.files[0]); //ảnh 

		var requestOptions = {
			method: 'POST',
			body: formdata,
			redirect: 'follow'
		};

		fetch("/admin/api/uploadfile", requestOptions)
			.then(response => console.log(response))
			.catch(error => console.error('error', error));
	}

	$scope.deleteProduct = function(product2) {
		$scope.editproduct(product2);
		$http.post('/admin/api/deleteproduct', $scope.Products).then(function(response) {
			// Xử lý phản hồi từ server sau khi xóa thành công.
			$scope.loadproduct();
			$scope.editproduct(null);
		}, function(error) {
			// Xử lý lỗi nếu yêu cầu xóa không thành công.
			console.error(error);
		});
	};

	$scope.restoreProduct = function(product2) {
		$scope.editproduct(product2);
		$http.post('/admin/api/restoreproduct', $scope.Products).then(function(response) {
			// Xử lý phản hồi từ server sau khi xóa thành công.
			$scope.loadproductdelete();
			$scope.editproduct(null);
		}, function(error) {
			// Xử lý lỗi nếu yêu cầu xóa không thành công.
			console.error(error);
		});
	};

	$scope.loadproduct = function() {
		$http.get('/admin/api/loadproduct')
			.then(function(response) {
				$scope.listproduct = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.loadproductype = function() {
		$http.get('/admin/api/loadproducttype')
			.then(function(response) {
				$scope.lisypeoductype = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.loadproductdelete = function() {
		$http.get('/admin/api/loadproduct_delete')
			.then(function(response) {
				$scope.listproduct = null;
				$scope.listproduct = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.editproduct = function(product) {
		$scope.Products = product;
	};

	$scope.changetable = () => {
		if ($scope.tablecheck == true) {
			$scope.loadproductdelete();
		} else {
			$scope.loadproduct();
		}
	}
	
	
	
	$scope.orderby = function(nameny){
		$scope.nameorderby =nameny;
	}
	
});

app.controller('accountCtrl', function($scope, $http) {
	$scope.Account = {
		id: null,
		email: '',
		fullname: '',
		address: '',
		phonenumber: '',
		birthday:new Date(),
		gender: false,
		role: false,
		deletestatus: false,
		list_orders:null
	};

	$scope.listaccount = [];

	$scope.updateAccount = function(){ 
		$http.post("/admin/api/updateaccount", $scope.Account).then(function(response) {
			$scope.loadaccount();
			$scope.editaccount(null);
		}, function(response) {
			console.log(response);
		});
	};

	$scope.deleteAccount = function(account) {
		$scope.editaccount(account);
		$http.post("/admin/api/deleteaccount", $scope.Account).then(function(response) {
			$scope.loadaccount();
			$scope.editaccount(null);
		}, function(response) {
			console.log(response);
		});
	};

	$scope.restoreAccount = function(account) {
		$scope.editaccount(account);
		$http.post("/admin/api/restoreaccount", $scope.Account).then(function(response) {
			$scope.loadaccountdelete();
			$scope.editaccount(null);
		}, function(response) {
			console.log(response);
		});
	};

	$scope.loadaccount = function() {
		$scope.listaccount = null;
		$http.get('/admin/api/loadaccount')
			.then(function(response) {
				$scope.listaccount = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.loadaccountdelete = function() {
		$scope.listaccount = null;
		$http.get('/admin/api/loadaccount_delete')
			.then(function(response) {
				$scope.listaccount = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.editaccount = function(account) {
		$scope.Account = account;
		$scope.Account.birthday = new Date($scope.Account.birthday);
	};

	$scope.changetable = () => {
		if ($scope.tablecheck2 == true) {
			$scope.loadaccountdelete();
		} else {

			$scope.loadaccount();
		}
	}
	
	$scope.orderby = function(nameny){
		$scope.nameorderby =nameny;
	}
	
});

app.controller('orderCtrl', function($scope, $http) {
	$scope.listorders = [];
	$scope.listitems = [];
	$scope.loadorders = function() {
		$http.get('/admin/api/getorders')
			.then(function(response) {
				$scope.listorders = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};
	
	$scope.opendetailorder = function(idorder) {

		$http.post("/admin/api/getorderdetail", idorder)
		.then(function(response) {
			sessionStorage.setItem('order', JSON.stringify(response.data.order));
                    sessionStorage.setItem('orderdetail', JSON.stringify(response.data.orderdetail));
                    window.location.href = '/trangchu/detail';
			/*window.location.href = '/trangchu/detail';*/
		});
	};
	
	$scope.setordersstatus = function(nametrangthai) {	
		if($scope.listitems==null){
				$scope.findadorder = nametrangthai;
			
		}else{
		for (var i = 0; i < $scope.listitems.length; i++) {
				$scope.listitems[i].statusorder =nametrangthai;
			}
		$http.post("/admin/api/setorderstatus", $scope.listitems)
		.then(function(response) {
			$scope.loadorders();
			$scope.listitems = null;
		});
		}
	};
	
	$scope.trangthai = function(trangthai) {
		if (trangthai == 'Đã hủy') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkred'
				}
			}
		} else if (trangthai == 'Đang vận chuyển ') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkturquoise'
				}
			}
		} else if (trangthai == 'Đã giao') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkgreen'
				}
			}
		} else{
			return {
				value: trangthai,
				style: {
					'background-color': 'slategray'
				}
			}
		}
	}

	$scope.checkalllist = function() {
		if ($scope.checkall) {
			$scope.listitems = angular.copy($scope.listorders);
		} else {
			$scope.listitems = [];
		}
		angular.forEach($scope.listorders, function(item) {
			item.checked = $scope.checkall;
		});
	}

	$scope.toggleItem = function(item) {
		if (item.checked == true) {
			// Thêm vào mảng nếu chưa tồn tại và được chọn
			$scope.listitems.push(item);
		} else {
			for (var i = 0; i < $scope.listitems.length; i++) {
				if ($scope.listitems[i].idProductAccount == item.idProductAccount) {
					var index = i;
					break;
				}
			}
			$scope.listitems.splice(index, 1);
		}
	};

	$scope.isChecked = function(item) {
		return !$scope.checkall || item.checked;
	};
	
	$scope.orderby = function(nameny){
		$scope.nameorderby =nameny;
	}
	
});

app.controller('detailCtrl', function($scope, $http) {
	$scope.autoget= function(){
		$scope.khachhang = JSON.parse(sessionStorage.getItem('order'));
		$scope.danhsachsanpham = JSON.parse(sessionStorage.getItem('orderdetail'));
	}
	
	$scope.calculateTotalAmount = function () {
                var totalAmount = 0;
                
                angular.forEach($scope.danhsachsanpham, function (item) {
                    totalAmount += item.quantity * item.product.price;
                });
                return totalAmount;
            };
	
	$scope.trangthai = function(trangthai) {
		if (trangthai == 'Đã hủy') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkred'
				}
			}
		} else if (trangthai == 'Đang vận chuyển ') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkturquoise'
				}
			}
		} else if (trangthai == 'Đã giao') {
			return {
				value: trangthai,
				style: {
					'background-color': 'darkgreen'
				}
			}
		} else{
			return {
				value: trangthai,
				style: {
					'background-color': 'slategray'
				}
			}
		}
	}
	
	$scope.autoget();
});

app.controller('staCtrl', function($scope, $http) {
	$scope.count_number = {
		"count_account": 0,
		"count_product": 0,
		"count_order": 0
	};

	$scope.countstatic = function() {
		$http.get('/admin/api/chart/admin/api/count_statistical')
			.then(function(response) {
				$scope.count_number = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};
});

app.controller('chartCtrl', function($scope, $http) {

	$scope.auto = function() {
		var barcolors = [
			'rgb(78, 121, 167)',
			'rgb(242, 142, 43)',
			'rgb(225, 87, 89)',
			'rgb(118, 183, 178)',
			'rgb(89, 161, 79)',
			'rgb(237, 201, 72)',
			'rgb(176, 122, 161)',
			'rgb(255, 157, 167)',
			'rgb(156, 117, 95)',
			'rgb(186, 176, 172)',
			'rgb(106, 61, 154)',
			'rgb(97, 114, 155)',
			'rgb(162, 108, 69)',
			'rgb(106, 130, 108)',
			'rgb(147, 112, 219)',
			'rgb(132, 159, 188)',
			'rgb(189, 103, 107)',
			'rgb(180, 149, 90)',
			'rgb(90, 154, 154)',
			'rgb(134, 106, 149)'
		];
		// Khởi tạo chartData
		$scope.chartData = [];

		// Thực hiện GET request đến API
		$http.get('/admin/api/chart/productpricemonth')
			.then(function(response) {
				// Xử lý dữ liệu nhận được từ API
				var rawData = response.data;

				// Chuyển đổi định dạng dữ liệu
				$scope.chartData = rawData.map(function(item) {
					return [item[0], item[1]];
				});

				// Gọi hàm vẽ biểu đồ
				drawChart();
			})
			.catch(function(error) {
				console.error('Error:', error);
			});

		// Hàm vẽ biểu đồ
		function drawChart() {
			var labels = $scope.chartData.map(function(item) {
				return item[0].toString(); // Hoặc sử dụng String(item[0]) để chắc chắn có kiểu chuỗi
			});
			var values = $scope.chartData.map(function(item) {
				return item[1];
			});

			// Sử dụng thư viện vẽ biểu đồ (ví dụ: Chart.js)
			var ctx = document.getElementById('myChartcountproductyear').getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'bar',
				data: {
					labels: labels,
					datasets: [{
						label: 'Doanh thu',
						data: values,
						backgroundColor: barcolors,
						borderColor: 'black',
						borderWidth: 1,
						borderDash: [5, 5]
					}]
				},
				options: {
					maintainAspectRatio: false,
					scales: {
						x: {
							beginAtZero: true,
							grid: {
								display: false // Ẩn đường kẻ ngang
							}
						},
						y: {
							beginAtZero: true,
						}
					},
					plugins: {
						title: {
							display: false,
							text: 'Column Chart Example',
							position: 'bottom'
						},
						legend: {
							display: false
						}
					}
				}
			});
		}
	}

	$scope.auto2 = function() {
		var pieChartColors = [
			'rgb(78, 121, 167)',
			'rgb(242, 142, 43)',
			'rgb(225, 87, 89)',
			'rgb(118, 183, 178)',
			'rgb(89, 161, 79)',
			'rgb(237, 201, 72)',
			'rgb(176, 122, 161)',
			'rgb(255, 157, 167)',
			'rgb(156, 117, 95)',
			'rgb(186, 176, 172)',
			'rgb(106, 61, 154)',
			'rgb(97, 114, 155)',
			'rgb(162, 108, 69)',
			'rgb(106, 130, 108)',
			'rgb(147, 112, 219)',
			'rgb(132, 159, 188)',
			'rgb(189, 103, 107)',
			'rgb(180, 149, 90)',
			'rgb(90, 154, 154)',
			'rgb(134, 106, 149)'
		];


		// Khởi tạo chartData
		$scope.chartData = [];

		// Thực hiện GET request đến API
		$http.get('/admin/api/chart/productcountmonth')
			.then(function(response) {
				// Xử lý dữ liệu nhận được từ API
				var rawData = response.data;

				// Chuyển đổi định dạng dữ liệu
				$scope.chartData = rawData.map(function(item) {
					return [item[0], item[1]];
				});

				// Gọi hàm vẽ biểu đồ
				drawChart();
			})
			.catch(function(error) {
				console.error('Error:', error);
			});

		// Hàm vẽ biểu đồ
		function drawChart() {
			var labels = $scope.chartData.map(function(item) {
				return item[0].toString(); // Hoặc sử dụng String(item[0]) để chắc chắn có kiểu chuỗi
			});
			var values = $scope.chartData.map(function(item) {
				return item[1];
			});

			// Sử dụng thư viện vẽ biểu đồ (ví dụ: Chart.js)
			var ctx = document.getElementById('myPieChart').getContext('2d');
			var myChart = new Chart(ctx, {
				type: 'pie',
				data: {
					labels: labels,
					datasets: [{
						label: 'Số lượng',
						data: values,
						backgroundColor: pieChartColors,
						hoverOffset: 4
					}]
				}
			});
		}
	}

	$scope.auto();
	$scope.auto2();
});

app.controller('voucherCtrl', function($scope, $http) {
	$scope.Voucher = {
		id: null,
		codevoucher: null,
		percent: null,
		startvoucher: new Date(),
		endvoucher: new Date(),
		deletestatus: false,
		list_product: []
	};
	$scope.listvoucher = [];

	$scope.updateVoucher = function() {
		$scope.Voucher.startvoucher = $scope.formatDate($scope.Voucher.startvoucher);
		$scope.Voucher.endvoucher = $scope.formatDate($scope.Voucher.endvoucher);
		$http.post("/admin/api/savevoucher", $scope.Voucher).then(function(response) {
			$scope.loadVoucher();
			$scope.editvoucher(null);
		}, function(response) {
			console.log(response);
		});

	};

	$scope.editvoucher = function(voucher) {
		if (voucher == null) {
			$scope.Voucher = voucher;
		} else {
			voucher.startvoucher = new Date(voucher.startvoucher);
			voucher.endvoucher = new Date(voucher.endvoucher);
			$scope.Voucher = voucher;
		}
	}

	$scope.deleteVoucher = function(voucher) {
		$scope.editvoucher(voucher);
		$http.post('/admin/api/deletevoucher', $scope.Voucher).then(function(response) {
			// Xử lý phản hồi từ server sau khi xóa thành công.
			$scope.loadVoucher();
			$scope.editvoucher(null);
		}, function(error) {
			// Xử lý lỗi nếu yêu cầu xóa không thành công.
			console.error(error);
		});
	};

	$scope.restoreVoucher = function(voucher) {

		$http.post('/admin/api/restorevoucher', voucher).then(function(response) {
			// Xử lý phản hồi từ server sau khi xóa thành công.
			$scope.loadVoucherdelete();
			$scope.editvoucher(null);
		}, function(error) {
			// Xử lý lỗi nếu yêu cầu xóa không thành công.
			$scope.loadVoucherdelete();
		});
	};

	$scope.loadVoucher = function() {
		$http.get('/admin/api/getallvoucher')
			.then(function(response) {
				$scope.listvoucher = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};

	$scope.loadVoucherdelete = function() {
		$http.get('/admin/api/getallvoucherdeleted')
			.then(function(response) {
				$scope.listvoucher = response.data;
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	};
	
	$scope.autodeletevoucher = function(){
		$http.get('/admin/api/autodeletevoucher')
			.then(function(response) {
				$scope.loadVoucher();
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			});
	}

	$scope.changetable = () => {
		if ($scope.tablecheck == true) {
			$scope.loadVoucherdelete();
		} else {
			$scope.loadVoucher();
		}
	}

	$scope.formatDate = function(date) {
		var day = date.getDate();
		var month = date.getMonth() + 1; // Month is zero-based
		var year = date.getFullYear();

		// Ensure two digits for day and month
		day = day < 10 ? '0' + day : day;
		month = month < 10 ? '0' + month : month;

		return year + '-' + month + '-' + day;
	};
	
	$scope.autogeneratedidvoucher = function(length){
		const characters = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
    let randomCode = '';

    for (let i = 0; i < length; i++) {
        const randomIndex = Math.floor(Math.random() * characters.length);
        randomCode += characters.charAt(randomIndex);
    }
   return randomCode;
	}
	
	$scope.macotrungkhong = function(code){
		let list;
		$http.get('/admin/api/getallvoucherforgenerated')
			.then(function(response) {
				list = response.data;
				for (let i = 0; i < list.length; i++) {
        if (list[i].codevoucher === code) {
            return true; // Mã trùng lặp
        }
    }
    return false;	
			}, function(error) {
				// Xử lý lỗi nếu yêu cầu xóa không thành công.
				console.error(error);
			}); 
		
	}
	
	$scope.generatedvouchercodevoucher = function(){
		let newCode;
		
    do {
        newCode = $scope.autogeneratedidvoucher(7);
    } while ($scope.macotrungkhong(newCode));

    $scope.Voucher.codevoucher = newCode;
	}
	
	$scope.orderby = function(nameny){
		$scope.nameorderby =nameny;
	}

	$scope.autodeletevoucher();
});

