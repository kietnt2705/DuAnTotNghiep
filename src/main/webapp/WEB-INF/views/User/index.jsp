<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Linh kiện điện tử</title>
    <script src="https://kit.fontawesome.com/d85087fef2.js" crossorigin="anonymous"></script>
    <link rel="stylesheet" href="css/style.css">

</head>

<body>
    <header> <img src="image/baner1.png" alt=""> </header>
    <nav>
        <div class="container">
            <ul>
                <li><a href=""><img style="width: 80px; " src="image/logo.png" alt=""></a></li>
                <li><a href=""><button><i class="fa-solid fa-sort-down"></i>Danh mục</button></a></li>
                <li><input type="text" placeholder="Bạn cần tìm gì?"><i class="fa-solid fa-magnifying-glass"></i></li>
                <li><a href=""><i class="fa-solid fa-headphones"></i>Hotline <br> 1800.6975</a></li>
                <li><a href=""><i class="fa-solid fa-location-dot"></i>Hệ thống <br> showroom</a></li>
                <li><a href=""><i class="fa-solid fa-cart-shopping"></i>Tra cứu <br> đơn hàng</a></li>
                <li><a href=""><i class="fa-solid fa-cart-plus"></i>Giỏ <br> hàng</a></li>
                <li id="form-login"><a href="#"><i class="fa-solid fa-user"></i>Đăng nhập</a></li>
<!-----------------------------------------------Đăng nhập----------------------------------------------------------------->      
                <div class="form-login">
                    <div class="form-login-all">
                        <form action="">
                            <div class="form-login-header">
                                <h2>ĐĂNG NHẬP HOẶC TẠO TÀI KHOẢN <span id="close-login">X</span></h2>
                            </div>
                            <div class="form-login-body">
                                <!------------------Đăng nhập---------------->
                                <div class="form-login-body-acount">
                                    <input type="text" placeholder="Email">
                                    <input type="password" placeholder="Mật khấu">
                                    <a href=""
                                        style="color: #333; font-family: Arial, Helvetica, sans-serif; font-style: italic; font-size: 17px;">Quên
                                        mật khẩu?</a>
                                    <button>Đăng nhập</button>
                                </div>
                                <!-------------------footer----------------------->
                                <div class="form-login-body-footer">
                                    <h4>Hoặc đăng nhập bằng</h4>
                                    <div class="form-login-body-footer-btn">
                                        <button class="btn-google-register"><i
                                                class="fa-brands fa-google-plus-g"></i>Google</button>
                                        <button class="btn-facebook-register"><i
                                                class="fa-brands fa-facebook"></i>Facebook</button>
                                    </div>
                                    <div class="form-login-body-footer-btn-text"><span>Bạn chưa có tài khoản?<a
                                                href="">Đăng ký ngay!</a></span></div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
<!-----------------------------------------------Đăng ký----------------------------------------------------------------->
                <div class="form-register">
                    <div class="form-register-all">
                        <form action="">
                            <div class="form-register-header">
                                <h2>ĐĂNG ký TÀI KHOẢN NGAY <span id="close-register">X</span></h2>
                            </div>
                            <div class="form-register-body">
                                <!------------------Đăng nhập---------------->
                                <div class="form-register-body-acount">
                                    <input type="text" placeholder="Họ và tên">
                                    <input type="text" placeholder="Email">
                                    <input type="password" placeholder="Mật khấu">
                                    <button>Tạo tài khoản</button>
                                </div>
                                <!-------------------footer----------------------->
                                <div class="form-register-body-footer">
                                    <h4>Hoặc đăng ký bằng</h4>
                                    <div class="form-register-body-footer-btn">
                                        <button class="btn-google-register"><i
                                                class="fa-brands fa-google-plus-g"></i>Google</button>
                                        <button class="btn-facebook-register"><i
                                                class="fa-brands fa-facebook"></i>Facebook</button>
                                    </div>
                                    <div class="form-register-body-footer-btn-text"><span>Bạn đã có tài khoản?<a
                                                href="">Đăng nhập!</a></span></div>
                                </div>
                            </div>
                        </form>
                    </div>
                </div>
            </ul>
        </div>
    </nav>
    <!-------------------------------menu-bar------------------------------------->
    <section class="menu-bar">
        <div class="container">
            <div class="menu-bar-content">
                <ul>
                    <li><a href=""><i class="fa-solid fa-ticket"></i>Tổng hợp khuyến mãi</a></li>
                    <li><a href=""><i class="fa-solid fa-microchip"></i>Linh kiện máy tính<i style="margin-left: 6px;"
                                class="fa-solid fa-sort-down"></i></a>
                        <div class="submenu">
                            <ul>
                                <li><a href=""><strong style="color: red;">VGA-Card màn hình</strong></a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                                <li><a href="">RTX ada4090</a></li>
                            </ul>
                        </div>

                    </li>
                    <li><a href=""><i class="fa-solid fa-desktop"></i>Màn hình<i style="margin-left: 6px;"
                                class="fa-solid fa-sort-down"></i></a></li>
                    <li><a href=""><i class="fa-solid fa-gamepad"></i>Phụ kiện<i style="margin-left: 6px;"
                                class="fa-solid fa-sort-down"></i></a></li>
                    <li><a href=""><i class="fa-solid fa-credit-card"></i>Hướng dẫn thanh toán</a></li>
                    <li><a href=""><i class="fa-solid fa-shield"></i>Chính sách bảo hành</a></li>
                </ul>
            </div>
        </div>
    </section>
    <!---------------------------------------------slider----------------------------------------------->
    <section class="slider">
        <div class="container">
            <div class="slider-content">
                <div class="slider-content-left">
                    <div class="slider-content-left-top-container">
                        <div class="slider-content-left-top">
                            <a href="product-detail.html"> <img src="image/slide1.png" alt=""></a>
                            <a href=""> <img src="image/slide2.png" alt=""></a>
                            <a href=""> <img src="image/slide3.png" alt=""></a>
                            <a href=""> <img src="image/slide4.png" alt=""></a>
                        </div>
                        <div class="slider-content-left-top-btn">
                            <i class="fa-solid fa-chevron-left"></i>
                            <i class="fa-solid fa-chevron-right"></i>
                        </div>
                    </div>
                    <div class="slider-content-left-bottom">
                        <a href=""><img src="image/slide5.png" style="height: 200px;" alt=""></a>
                        <a href=""><img src="image/slide5.png" style="height: 200px; " alt=""></a>
                        <!-- <a href=""><img src="image/slide5.png" style="height: 150px;" alt=""></a> -->
                    </div>
                </div>
                <div class="slider-content-right">
                    <li><a href=""><img src="image/slide7.png" style="height: 155px; width: 390px;" alt=""></a></li>
                    <li><a href=""><img src="image/slide8.png" style="height: 155px; width: 390px;" alt=""></a></li>
                    <li><a href=""><img src="image/slide9.png" style="height: 155px; width: 390px;" alt=""></a></li>
                </div>
            </div>
        </div>
    </section>
    <!-------------------------------slider-product-1--------------------------->
    <section class="slider-product-one">
        <div class="container">
            <div class="slider-product-one-content">
                <div class="slider-product-one-content-title">
                    <h2>SẢN PHẨM BÁN CHẠY</h2>
                    <ul>
                        <li><a href="">Xem tất cả<i class="fa-solid fa-caret-right"></i></a></li>
                    </ul>
                </div>
                <div class="slider-product-one-content-container">
                    <div class="slider-product-one-content-items-content">
                        <div class="slider-product-one-content-items">
                            <div class="slider-product-one-content-item">
                                <img src="image/baner3.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner2.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner4.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner5.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner6.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>
                        </div>
                        <div class="slider-product-one-content-items">
                            <div class="slider-product-one-content-item">
                                <img src="image/baner7.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner8.png" style="height: 200px;" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner9.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner10.png" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-one-content-item">
                                <img src="image/baner11.png" height="200px" alt="">
                                <div class="slider-product-one-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="slider-product-one-content-btn">
                        <i class="fa-solid fa-chevron-left fa-chevron-left-slide"></i>
                        <i class="fa-solid fa-chevron-right fa-chevron-right-slide"></i>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-------------------------------slider-product-2--------------------------->
    <section class="slider-product-two">
        <div class="container">
            <div class="slider-product-two-content">
                <div class="slider-product-two-content-title">
                    <h2>GAMING STATION</h2>
                    <ul>
                        <li><a href="">Xem tất cả<i class="fa-solid fa-caret-right"></i></a></li>
                    </ul>
                </div>
                <div class="slider-product-two-content-container">
                    <div class="slider-product-two-content-items-content">
                        <div class="slider-product-two-content-items">

                            <div class="slider-product-two-content-item">
                                <img src="image/baner3.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner2.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner4.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner5.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner6.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>
                        </div>
                        <div class="slider-product-two-content-items">

                            <div class="slider-product-two-content-item">
                                <img src="image/baner3.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner2.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner4.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner5.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>

                            <div class="slider-product-two-content-item">
                                <img src="image/baner6.png" alt="">
                                <div class="slider-product-two-content-item-text">
                                    <li><img src="image/icon.png" alt="">
                                        <p>Sản phẩm hot</p>
                                    </li>
                                    <li>Bàn phím Akko 3084B Plus Blue On White</li>
                                    <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                    <li style="color: red;">1.490.000 <sup>đ</sup><span
                                            style="color: red; padding: 0 5px;">-29%</span></li>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="slider-product-two-content-btn">
                        <i class="fa-solid fa-chevron-left fa-chevron-left-slide-two"></i>
                        <i class="fa-solid fa-chevron-right fa-chevron-right-slide-two"></i>
                    </div>
                </div>

            </div>
        </div>
    </section>
    <!--------------------------------Poduct-Gallery 1----------------------------------------->
    <section class="product-gallery-one">
        <div class="container">
            <div class="product-gallery-one-content">
                <div class="product-gallery-one-content-title">
                    <h2 style="font-style: italic; padding-top: 10px; color: #333;">PC bán chạy</h2>
                    <ul>
                        <li><a href="">PC Gaming</a></li>
                        <li><a href="">PC Đồ họa</a></li>
                        <li><a href="">PC Doanh nghiệp</a></li>
                        <li><a href="">Xem tất cả</a></li>
                    </ul>
                </div>
                <div class="product-gallery-one-content-product">
                    <div class="product-gallery-one-content-product-items">
                        <div class="product-gallery-one-content-product-item">
                            <img src="image/gl1.png" alt="">
                            <div class="product-gallery-one-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-one-content-product-item">
                            <img src="image/gl2.png" alt="">
                            <div class="product-gallery-one-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-one-content-product-item">
                            <img src="image/gl3.png" alt="">
                            <div class="product-gallery-one-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-one-content-product-item">
                            <img src="image/gl4.png" style="height: 170px;" alt="">
                            <div class="product-gallery-one-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-one-content-product-item">
                            <img src="image/gl5.png" alt="">
                            <div class="product-gallery-one-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--------------------------------Poduct-Gallery 2----------------------------------------->
    <section class="product-gallery-two">
        <div class="container">
            <div class="product-gallery-two-content">
                <div class="product-gallery-two-content-title">
                    <h2 style="font-style: italic; padding-top: 10px; color: #333;">Chuột bán chạy</h2>
                    <ul>
                        <li><a href="">Logitech</a></li>
                        <li><a href="">Razer</a></li>
                        <li><a href="">Asus</a></li>
                        <li><a href="">corsair</a></li>
                        <li><a href="">Dare-U</a></li>
                        <li><a href="">Glorious</a></li>
                        <li><a href="">Xem tất cả</a></li>
                    </ul>
                </div>
                <div class="product-gallery-two-content-product">
                    <div class="product-gallery-two-content-product-items">
                        <div class="product-gallery-two-content-product-item">
                            <img src="image/gl6.png" alt="">
                            <div class="product-gallery-two-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-two-content-product-item">
                            <img src="image/gl7.png" alt="">
                            <div class="product-gallery-two-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-two-content-product-item">
                            <img src="image/gl8.png" alt="">
                            <div class="product-gallery-two-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-two-content-product-item">
                            <img src="image/gl9.png" style="height: 200px;" alt="">
                            <div class="product-gallery-two-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-two-content-product-item">
                            <img src="image/gl10.png" alt="">
                            <div class="product-gallery-two-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--------------------------------Poduct-Gallery 3----------------------------------------->
    <section class="product-gallery-three">
        <div class="container">
            <div class="product-gallery-three-content">
                <div class="product-gallery-three-content-title">
                    <h2 style="font-style: italic; padding-top: 10px; color: #333;">Bàn phím bán chạy</h2>
                    <ul>
                        <li><a href="">Akko</a></li>
                        <li><a href="">Asus</a></li>
                        <li><a href="">Razer</a></li>
                        <li><a href="">Logitech</a></li>
                        <li><a href="">Leopold</a></li>
                        <li><a href="">DareU</a></li>
                        <li><a href="">Xem tất cả</a></li>
                    </ul>
                </div>
                <div class="product-gallery-three-content-product">
                    <div class="product-gallery-three-content-product-items">
                        <div class="product-gallery-three-content-product-item">
                            <img src="image/gl11.png" alt="">
                            <div class="product-gallery-three-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-three-content-product-item">
                            <img src="image/gl12.png" alt="">
                            <div class="product-gallery-three-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-three-content-product-item">
                            <img src="image/gl13.png" alt="">
                            <div class="product-gallery-three-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-three-content-product-item">
                            <img src="image/gl14.png" style="height: 200px;" alt="">
                            <div class="product-gallery-three-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-three-content-product-item">
                            <img src="image/gl15.png" alt="">
                            <div class="product-gallery-three-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!--------------------------------Banner----------------------------------------->
    <section class="banner">
        <div class="container">
            <div class="baner-content">
                <div class="banner-content-logo">
                    <img src="image/layout.png" alt="">
                    <img src="image/layout2.png" alt="">
                </div>
            </div>
        </div>
    </section>
    <!--------------------------------Poduct-Gallery 4----------------------------------------->
    <section class="product-gallery-four">
        <div class="container">
            <div class="product-gallery-four-content">
                <div class="product-gallery-four-content-title">
                    <h2 style="font-style: italic; padding-top: 10px; color: #333;">Màn hình chính hãng</h2>
                    <ul>
                        <li><a href="">LG</a></li>
                        <li><a href="">Asus</a></li>
                        <li><a href="">ViewSonic</a></li>
                        <li><a href="">Dell</a></li>
                        <li><a href="">Gigabyte</a></li>
                        <li><a href="">AOC</a></li>
                        <li><a href="">Acer</a></li>
                        <li><a href="">Xem tất cả</a></li>
                    </ul>
                </div>
                <div class="product-gallery-four-content-product">
                    <div class="product-gallery-four-content-product-items">
                        <div class="product-gallery-four-content-product-item">
                            <img src="image/gl17.png" alt="">
                            <div class="product-gallery-four-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-four-content-product-item">
                            <img src="image/gl18.png" alt="">
                            <div class="product-gallery-four-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-four-content-product-item">
                            <img src="image/gl19.png" alt="">
                            <div class="product-gallery-four-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-four-content-product-item">
                            <img src="image/gl20.png" style="height: 200px;" alt="">
                            <div class="product-gallery-four-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>

                        <div class="product-gallery-four-content-product-item">
                            <img src="image/gl16.png" alt="">
                            <div class="product-gallery-four-content-product-item-text">
                                <li><img src="image/icon.png" alt="">
                                    <p>Sản phẩm hot</p>
                                </li>
                                <li>PC GVN Gaming Intel i9</li>
                                <li><a href="">2.099.000 <sup>đ</sup></a></li>
                                <li style="color: red;">1.490.000 <sup>đ</sup><span
                                        style="color: red; padding: 0 5px;">-29%</span></li>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </section>
    <!-------------------------------------------------list --------------------------------------------------------->
    
    <script src="scrip.js"></script>
</body>

</html>