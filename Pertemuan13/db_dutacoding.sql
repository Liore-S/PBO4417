-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 15, 2021 at 03:54 PM
-- Server version: 10.4.19-MariaDB
-- PHP Version: 8.0.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_dutacoding`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_pendaftaran`
--

CREATE TABLE `tbl_pendaftaran` (
  `nik` varchar(15) NOT NULL,
  `nama` varchar(30) NOT NULL,
  `jk` varchar(15) NOT NULL,
  `alamat` varchar(20) NOT NULL,
  `alasan` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_pendaftaran`
--

INSERT INTO `tbl_pendaftaran` (`nik`, `nama`, `jk`, `alamat`, `alasan`) VALUES
('1111', 'Arby', 'Laki-Laki', 'Tegal', 'Persaingan Konoha Ketat'),
('222', 'CK', 'Laki-Laki', 'Kudus', 'Karena ingin pamer achievement kalo Juara'),
('666', 'Davi', 'Laki-Laki', 'Pati', 'Tapi Aku Takut kehilangan cintamu'),
('6969', 'Ilham', 'Laki-Laki', 'Tegal', 'Biar jadi Mantu Idaman Azzeekkk!!');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_pendaftaran`
--
ALTER TABLE `tbl_pendaftaran`
  ADD PRIMARY KEY (`nik`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
