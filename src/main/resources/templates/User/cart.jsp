<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <meta name="description" content="Ogani Template">
    <meta name="keywords" content="Ogani, unica, creative, html">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>

    <!-- Css Styles -->
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">
    <link rel="stylesheet" href="css/font-awesome.min.css" type="text/css">
    <link rel="stylesheet" href="css/elegant-icons.css" type="text/css">
    <link rel="stylesheet" href="css/nice-select.css" type="text/css">
    <link rel="stylesheet" href="css/jquery-ui.min.css" type="text/css">
    <link rel="stylesheet" href="css/owl.carousel.min.css" type="text/css">
    <link rel="stylesheet" href="css/slicknav.min.css" type="text/css">
    <link rel="stylesheet" href="css/style.css" type="text/css">
</head>

<body>
    <section class="shoping-cart spad">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__table">
                        <table>
                            <thead>
                                <tr>
                                    <th></th>
                                    <th class="shoping__product">Sản phẩm</th>
                                    <th>Đơn giá</th>
                                    <th>Số lượng</th>
                                    <th>Thành tiền</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <c:forEach var="item" items="">
                                <form action="">
                                    <tbody>
                                        <tr>
                                            <td>
                                                <input type="checkbox">
                                            </td>
                                            <td class="shoping__cart__item"><img src=""
                                                    alt="">
                                                <h5>xx</h5>
                                            </td>
                                            <td class="shoping__cart__price">xx</td>
                                            <td class="shoping__cart__quantity">
                                                <div class="quantity">
                                                    <div class="pro-qty">
                                                        <input type="number" min="1" max="10" name="qty"
                                                            value="" onblur="">
                                                    </div>
                                                </div>
                                            </td>
                                            <td class="shoping__cart__total">xx</td>
                                            <input type="hidden" name="id" value="">
                                            <td class="shoping__cart__item__close"><a
                                                    href=""><span class=""
                                                        onclick="">x</span></a></td>
                                        </tr>
                                    </tbody>
                                </form>
                            </c:forEach>
                        </table>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-lg-12">
                    <div class="shoping__cart__btns">
                        <a href="#" class="primary-btn cart-btn">Tiếp tục mua sắm</a> <a href="#"
                            class="primary-btn cart-btn cart-btn-right">Cập nhật giỏ
                            hàng</a>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__continue">
                        <div class="shoping__discount">
                            <h5>Khuyến mãi</h5>
                            <form action="#">
                                <input type="text" placeholder="Nhập mã khuyến mãi">
                                <button type="submit" class="site-btn">Apply</button>
                            </form>
                        </div>
                    </div>
                </div>
                <div class="col-lg-6">
                    <div class="shoping__checkout">
                        <h5>Thanh toán</h5>
                        <ul>
                            <li>Tổng tạm tính<span>$454.98</span></li>
                            <li>Thành tiền<span>$454.98</span></li>
                        </ul>
                        <a href="#" class="primary-btn">Tiếp tục</a>
                    </div>
                </div>
            </div>
        </div>
    </section>

    <!-- Js Plugins -->
    <script src="js/jquery-3.3.1.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
    <script src="js/jquery.nice-select.min.js"></script>
    <script src="js/jquery-ui.min.js"></script>
    <script src="js/jquery.slicknav.js"></script>
    <script src="js/mixitup.min.js"></script>
    <script src="js/owl.carousel.min.js"></script>
    <script src="js/main.js"></script>

</body>

</html>