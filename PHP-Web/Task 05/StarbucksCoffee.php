<!doctype html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
          integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="style/style.css">
    <title>Starbucks Coffee</title>
</head>
<body>
<hr id="hr_top">
<section id="menu">
    <div class="container-fluid">
        <nav class="navbar navbar-expand-lg">
            <a class="navbar-brand" href="#"><img src="image/logo.png" alt=""></a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
                    aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#"> CÀ PHÊ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">THỰC ĐƠN</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">QUÁN CÀ PHÊ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">TRÁCH NHIỆM</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">VỀ CHÚNG TÔI</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">THẺ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">ESTORE</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>
</section>

<section class="article">
    <div class="contaier-fuild">
        <h2>Cà phê Xay Frappuccino®</h2>
        <?php
        $hn = 'localhost';
        $un = 'root';
        $pw = '';
        $db = 'starbuckscoffee';
        $conn = new mysqli($hn, $un, $pw, $db);
        if ($conn->connect_error) die($conn->connect_error);
        $query = "SELECT * FROM coffee";
        $result = $conn->query($query);
        if (!$result) die($conn->error);

        $rows = $result->num_rows;
        for ($j = 0; $j < $rows; $j++) {
            $row = $result->fetch_array(MYSQLI_ASSOC);
            echo '<div class="iamge_product">
                    <img width="180" height="180 class ="img_items" src="image/image_product/' . $row['image'] . '">
                    <b  class="title">' . $row['title'] . '</b>
                </div>';
        }
        ?>

    </div>

</section>
<section class="article_bot">
    <div class="container-fuild">
        <b><a href="#" class="article_a">Thực đơn</a></b>
        <b><a href="#">Thức uống</a></b> <span>Cà phê Xay Frappuccino®</span>
    </div>
</section>
<div id="footer">
    <section class="footer_top">
        <div class="container-fuild">
            <a href="#"><i style="font-size:40px" class="fa">&#xf09a;</i></a>
            <a href="#"><i style="font-size:40px" class="fa">&#xf16d;</i></a>
        </div>
    </section>
    <section class="footer_main">
        <div class="container-fuild">
            <div class="row">
                <div class="col-sm-3">
                    <ol>
                        <li><a href="#"><h6><b>VỀ CHÚNG TÔI</b></h6></a></li>
                        <li><a href="#">Di sản</a></li>
                        <li><a href="#">Công ty</a></li>
                        <li><a href="#">Cơ hội nghề nghiệp</a></li>
                    </ol>

                </div>

                <div class="col-sm-3">
                    <ol>
                        <li><a href="#"><h6><b>DỊCH VỤ KHÁCH HÀNG</b></h6></a></li>
                        <li><a href="#">Câu hỏi thường gặp</a></li>

                    </ol>

                </div>

                <div class="col-sm-3">
                    <ol>
                        <li><a href="#"><h6><b>LIÊN KẾT NHANH</b></h6></li>
                        <li><a href="#">Bộ định vị cửa hàng</a></li>
                        <li><a href="#">Dành cho Đối tác</a></li>

                    </ol>

                </div>
            </div>

        </div>
    </section>

    <section class="footer_bottom">
        <div class="container-fuild">
            <ul>
                <li id="content"><img src="image/icon_vn.png" alt=""></li>
                <li>Tiếng Việt (VN)</li>
                <li><a href="#"><b id="content_1">English</b></a><span>»</span></li>
            </ul>
        </div>
        <div id="content_2" class="container-fuild" style="margin: 0 0 0 -20px">
            <ul>
                <li><a href="#">Khả năng truy cập Web</a></li>
                <li><a href="#">Chính sách bảo mật thông tin</a></li>
                <li><a href="#">Điều khoản sử dụng</a></li>
                <li><a href="#">Sơ đồ trang Web</a></li>
                <li><a href="#">Tùy chọn Cookie</a></li>
            </ul>
        </div>
        <p>© 2019 Starbucks Coffee Company. Mọi quyền được bảo lưu.</p>
    </section>
</div>
<hr id="hr_bottom">


<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"
        integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"
        integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
        crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"
        integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>
</body>
</html>