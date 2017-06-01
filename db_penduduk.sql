-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 02, 2017 at 12:28 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 5.6.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_penduduk`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_akun`
--

CREATE TABLE `tb_akun` (
  `username` varchar(225) NOT NULL,
  `password` varchar(225) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_akun`
--

INSERT INTO `tb_akun` (`username`, `password`) VALUES
('mufi', '123'),
('evan', 'qmzpal');

-- --------------------------------------------------------

--
-- Table structure for table `tb_data`
--

CREATE TABLE `tb_data` (
  `NIK` int(11) NOT NULL,
  `Nama` text NOT NULL,
  `TTL` varchar(50) NOT NULL,
  `Jenis Kelamin` varchar(1) NOT NULL,
  `Alamat` text NOT NULL,
  `RT/RW` varchar(50) NOT NULL,
  `Kel/Desa` varchar(50) NOT NULL,
  `Kecamatan` varchar(50) NOT NULL,
  `Agama` varchar(50) NOT NULL,
  `Status` varchar(50) NOT NULL,
  `Pekerjaan` varchar(50) NOT NULL,
  `Kewarganegaraan` varchar(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_data`
--

INSERT INTO `tb_data` (`NIK`, `Nama`, `TTL`, `Jenis Kelamin`, `Alamat`, `RT/RW`, `Kel/Desa`, `Kecamatan`, `Agama`, `Status`, `Pekerjaan`, `Kewarganegaraan`) VALUES
(123, 'Evan', 'Malang, 30-04-2000', 'L', 'Malang', '10/01', 'Kurang Paham', 'Blimbing', 'Islam', 'Jomblo', 'Peng-anggur-an', 'WNI');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_data`
--
ALTER TABLE `tb_data`
  ADD PRIMARY KEY (`NIK`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
