-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 23, 2021 lúc 05:47 AM
-- Phiên bản máy phục vụ: 10.4.17-MariaDB
-- Phiên bản PHP: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `starbuckscoffee`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `coffee`
--

CREATE TABLE `coffee` (
  `image` longtext DEFAULT NULL,
  `title` varchar(255) CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `coffee`
--

INSERT INTO `coffee` (`image`, `title`) VALUES
('1.png', 'Asian Dolce Frappuccino® Blended Beverage'),
('2.jpg', 'Thức uống với Cà phê Xay Frappuccino'),
('3.jpg', 'Thức uống với Cà phê Xay Nhẹ Frappuccino'),
('4.jpg', 'Thức uống Xay Frappuccino® Espresso'),
('5.jpg', 'Cà phê Xay Nhẹ Frappuccino® Espresso'),
('6.jpg', 'Caramel Frappuccino® Blended Beverage'),
('7.jpg', 'Caramel Frappuccino® Light blended beverage'),
('8.jpg', 'Cà phê Mocha Xay Frappuccino®'),
('9.jpg', 'Thức uống với Cà phê Mocha Xay Nhẹ Frappuccino®'),
('10.jpg', 'Java Chip Frappuccino® Blended Coffee'),
('11.jpg', 'Java Chip Frappuccino® Light blended beverage');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
