<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Linh kiện điện tử</title>
    <script src="https://kit.fontawesome.com/d85087fef2.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/product.css">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet"
        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
</head>

<body>
    <main>
        <section class="product-details">
            <div class="product-image">
                <div class="col-8 align-center product-gallery">
                    <img src="image/image1.jpg" alt="">
                </div>
            </div>
            <div class="product-info">
                <h2 class="product-title">Tên sản phẩm</h2>
                <h1 class="product-price">99.99đ</h1>
                <p class="product-description">
                <p><span style="font-size:18px"><strong>Thông tin chung:</strong></span></p>
                <ul>
                    <li><span style="font-size:18px">Hãng sản xuất:<strong> ASUS&nbsp;</strong></span></li>
                    <li><span style="font-size:18px">Mã sản
                            phẩm:<strong>&nbsp;ROG-STRIX-RTX4090-O24G-EVA-02-EDITION</strong></span></li>
                    <li><span style="font-size:18px">Bảo hành:<strong> 36 Tháng</strong></span></li>
                </ul>
                </p>
                <button class="btn btn-danger">
                    <span>Mua ngay</span>
                    <br>
                    <span>(Giao tận nơi hoặc nhận tại cửa hàng)</span>
                </button>   
                <table>
                    <tr>
                        <td class="promotion-cell">
                            <p>Khuyến mãi</p>
                        </td>
                    </tr>
                    <tr>
                        <td class="promotion-cell-tt">
                            <p>Thông tin khuyến mãi</p>
                        </td>
                    </tr>
                </table>
            </div>
        </section>

        <section class="product-description">
            <div class="product-info">
                <h2>Mô tả sản phẩm</h2>
                <p>Đây là mô tả sản phẩm. Bạn có thể thêm nhiều văn bản và thông tin chi tiết ở đây.</p>
            </div>
            <div class="product-table">
                <table>
                    <tr>
                        <th>Cột 1</th>
                        <th>Cột 2</th>
                    </tr>
                    <tr>
                        <td>Dòng 1</td>
                        <td>Dòng 1</td>
                    </tr>
                    <tr>
                        <td>Dòng 2</td>
                        <td>Dòng 2</td>
                    </tr>
                    <tr>
                        <td>Dòng 3</td>
                        <td>Dòng 3</td>
                    </tr>
                    <tr>
                        <td>Dòng 4</td>
                        <td>Dòng 4</td>
                    </tr>
                    <tr>
                        <td>Dòng 5</td>
                        <td>Dòng 5</td>
                    </tr>
                </table>
            </div>
        </section>

        <section class="product-inner">
            <div class="product-rating">
                <h2>Đánh giá sản phẩm</h2>
                <div class="average-rating">
                    <span class="star">&#9733;</span>
                    <span class="star">&#9733;</span>
                    <span class="star">&#9733;</span>
                    <span class="star">&#9733;</span>
                    <span class="star">&#9734;</span>
                </div>
                <p class="total-reviews">(15 đánh giá)</p>
            </div>
            <div class="user-reviews">
                <div class="user-review">
                    <h4>Người dùng A</h4>
                    <div class="user-rating">
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                    </div>
                    <p>Phản hồi: Đây là một sản phẩm tuyệt vời!</p>
                </div>
                <div class="user-review">
                    <h4>Người dùng B</h4>
                    <div class="user-rating">
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9733;</span>
                        <span class="star">&#9734;</span>
                    </div>
                    <p>Phản hồi: Sản phẩm khá tốt.</p>
                </div>
                <!-- Thêm các đánh giá khác ở đây -->
            </div>
        </section>

    </main>

    <script src="scrip.js"></script>
</body>

</html>