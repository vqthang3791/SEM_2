-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th2 22, 2021 lúc 07:31 PM
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
-- Cơ sở dữ liệu: `school`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `classics`
--

CREATE TABLE `classics` (
  `author` varchar(128) DEFAULT NULL,
  `title` varchar(128) DEFAULT NULL,
  `type` varchar(16) DEFAULT NULL,
  `year` char(4) DEFAULT NULL,
  `isbn` char(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `classics`
--

INSERT INTO `classics` (`author`, `title`, `type`, `year`, `isbn`) VALUES
('Mark Twain', 'The Adventures of Tom Sawyer', 'Fiction', '1876', '9781598184891'),
('Jane Austen', 'Pride and Prejudice', 'Fiction', '1811', '9780582506206'),
('Charles Darwin', 'The Origin of Species', 'Non-Fiction', '1856', '9780517123201'),
('Charls Dickens', 'The old Curiostity Shop', 'Fiction', '1841', '9780099533474'),
('William Shakespeare', 'Romeo and Juliet', 'Play', '1594', '9780192814968');
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
