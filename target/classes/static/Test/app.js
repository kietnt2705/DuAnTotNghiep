var myApp = angular.module('myApp', []);

myApp.controller('chartCtrl', function ($scope, $http) {

    // Khởi tạo chartData
    $scope.chartData = [];

    // Thực hiện GET request đến API
    $http.get('/admin/api/chart/countproductyear')
        .then(function (response) {
            // Xử lý dữ liệu nhận được từ API
            var rawData = response.data;

            // Chuyển đổi định dạng dữ liệu
            $scope.chartData = rawData.map(function (item) {
                return [item[0], item[1]];
            });

            // Gọi hàm vẽ biểu đồ
            drawChart();
        })
        .catch(function (error) {
            console.error('Error:', error);
        });

    // Hàm vẽ biểu đồ
    function drawChart() {
        var labels = $scope.chartData.map(function (item) {
            return item[1].toString(); // Hoặc sử dụng String(item[0]) để chắc chắn có kiểu chuỗi
        });
        var values = $scope.chartData.map(function (item) {
            return item[0];
        });

        // Sử dụng thư viện vẽ biểu đồ (ví dụ: Chart.js)
        var ctx = document.getElementById('myChart').getContext('2d');
        var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [{
                label: 'Sample Data',
                data: values,
                backgroundColor: 'darkblue',
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
                    display: true,
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
    
});


/*var app = angular.module('myApp', []);

app.controller('chartCtrl', function($scope,$http) {
    // Dữ liệu mẫu

    $scope.chartData = [];

    // Thực hiện GET request đến API
    $http.get('/admin/api/chart/countproductyear')
        .then(function (response) {
            var rawData = response.data;

            // Chuyển đổi định dạng dữ liệu
            $scope.chartData = rawData.map(function (item) {
                return [item[0], item[1]];
            });
        })
        .catch(function (error) {
            console.error('Error:', error);
        });

    $scope.chartData = [
        { label: 'January', value: 10 },
        { label: 'February', value: 20 },
        { label: 'March', value: 15 },
        { label: 'April', value: 25 },
        { label: 'May', value: 18 }
    ];

    // Chuẩn bị dữ liệu cho biểu đồ
    var labels = $scope.chartData.map(function(item) {
        return item[0].toString();
    });

    var values = $scope.chartData.map(function(item) {
        return item[1];
    });

    // Vẽ biểu đồ
    var ctx = document.getElementById('myChart').getContext('2d');
    var myChart = new Chart(ctx, {
        type: 'bar',
        data: {
            labels: labels,
            datasets: [{
                label: 'Sample Data',
                data: values,
                backgroundColor: 'darkblue',
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
                    display: true,
                    text: 'Column Chart Example',
                    position: 'bottom'
                },
                legend: {
                    display: false
                }
            }
        }
    });
});*/

// var app = angular.module('myApp', []);

// app.controller('ChartController', function($scope) {
//     // Dữ liệu mẫu
//     $scope.chartData = [
//         { label: 'January', value: 10 },
//         { label: 'February', value: 20 },
//         { label: 'March', value: 15 },
//         { label: 'April', value: 25 },
//         { label: 'May', value: 18 }
//     ];

//     // Chuẩn bị dữ liệu cho biểu đồ
//     var labels = $scope.chartData.map(function(item) {
//         return item.label;
//     });

//     var values = $scope.chartData.map(function(item) {
//         return item.value;
//     });

//     // Vẽ biểu đồ
//     var ctx = document.getElementById('myChart').getContext('2d');
//     var myChart = new Chart(ctx, {
//         type: 'bar',
//         data: {
//             labels: labels,
//             datasets: [{
//                 label: 'Sample Data',
//                 data: values,
//                 backgroundColor: 'rgba(75, 192, 192, 0.2)',
//                 borderColor: 'rgba(75, 192, 192, 1)',
//                 borderWidth: 1
//             }],
            
//         },
//         options: {
//             scales: {
//                 y: {
//                     beginAtZero: true
//                 }
//             }
//         }
//     });
// });
