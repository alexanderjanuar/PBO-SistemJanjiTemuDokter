-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 10, 2022 at 11:40 PM
-- Server version: 10.4.21-MariaDB
-- PHP Version: 7.4.23

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pa_pbo`
--

-- --------------------------------------------------------

--
-- Table structure for table `admin`
--

CREATE TABLE `admin` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `admin`
--

INSERT INTO `admin` (`username`, `password`) VALUES
('admin', 'admin');

-- --------------------------------------------------------

--
-- Table structure for table `dokter`
--

CREATE TABLE `dokter` (
  `id_dokter` int(11) NOT NULL,
  `nama dokter` varchar(50) NOT NULL,
  `spesialis` varchar(50) NOT NULL,
  `noTelp` varchar(50) NOT NULL,
  `email` varchar(50) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `dokter`
--

INSERT INTO `dokter` (`id_dokter`, `nama dokter`, `spesialis`, `noTelp`, `email`, `username`, `password`) VALUES
(1, 'Dr. Dachniar Dwi Astuti', 'Umum', '081253721895', 'Dachniar@gmail.com', 'dacniar123', 'dachniar123'),
(2, 'Dr. Muhammad Natsir Akil Sp.PD-KR', 'Penyakit Dalam', '081253141895', 'Natsirakil@gmail.com', 'natsir123', '111'),
(3, 'Dr. A. Deviriyanti Agung, Sp.OG', 'Kandungan', '08172191221', 'DeviriyantiAgung@gmail.com', 'Deviriyanti', 'Deviriyanti123'),
(4, 'Dr. Chamim Shobari Singoprawiro', 'Kandungan', '089127219123', 'ChamimShobariSingoprawiro@gmail.com', 'ChamimShobari', 'ChamimShobari123'),
(5, 'Dr. Dewi Rumiris Ulibasa L.Tobing', 'Kandungan', '089127219132', 'DewiRumirisUlibasa@gmail.com', 'DewiRumiris', 'DewiRumiris123'),
(6, 'Dr. Jihan Rosita', 'Umum', '08712819283', 'JihanRosita@gmail.com', 'Jihan', '111'),
(7, 'dr. A. Deviriyanti Agung, Sp.OG, Sp.', 'Kandungan', '08172191221', 'DeviriyantiAgung@gmail.com', 'deviriyanti', 'devi123'),
(8, 'dr. Amang Surachman, Sp.THT-KL, Sp.', 'THT', '0812912921', 'AmangSurachman@gmail.com', 'amansur', '1234'),
(9, 'dr. Edward Faisal, Sp.PD, Sp.', 'Penyakit Dalam', '0891219121', 'EdwardFaisal@gmail.com', 'edward', 'edward12'),
(10, 'dr. Ratu Jelita, Sp.M, Sp.', 'Mata', '08121912821', 'RatuJelita@gmail.com', 'ratujelita', 'rattu21'),
(11, 'alex', 'Umum', '12', '12', '12', '12'),
(12, 'admin', 'Kandungan', 'admin', '12', '12', '12'),
(13, 'Dokter', 'Kandungan', '12', '12', 'ope', 'ope');

-- --------------------------------------------------------

--
-- Table structure for table `janji temu`
--

CREATE TABLE `janji temu` (
  `id_janjiTemu` int(11) NOT NULL,
  `tanggal` date NOT NULL,
  `id_dokter` int(11) NOT NULL,
  `id_pasien` int(11) NOT NULL,
  `status` varchar(50) NOT NULL,
  `jenisPemeriksaan` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `janji temu`
--

INSERT INTO `janji temu` (`id_janjiTemu`, `tanggal`, `id_dokter`, `id_pasien`, `status`, `jenisPemeriksaan`) VALUES
(1, '2022-06-01', 1, 1, 'Accept', 'Elektrokardiogram'),
(2, '2022-06-11', 6, 22, 'Accept', 'Elektrokardiogram'),
(3, '2022-06-12', 1, 21, 'Accept', 'Elektrokardiogram'),
(4, '2022-06-13', 2, 23, 'Pending', 'Radiologi'),
(5, '2022-06-14', 4, 24, 'Accept', 'USG'),
(6, '2022-06-15', 5, 25, 'Pending', 'USG'),
(7, '2022-06-16', 3, 21, 'Accept', 'USG'),
(8, '2022-06-17', 4, 23, 'Pending', 'USG'),
(9, '2022-06-18', 5, 24, 'Accept', 'Subspesialisasi'),
(10, '2022-06-18', 2, 26, 'Pending', 'Kardiovaskular'),
(11, '2022-06-19', 5, 27, 'Pending', 'Ginekologik'),
(12, '2022-06-20', 5, 28, 'Accept', 'USG'),
(13, '2022-06-20', 4, 29, 'Pending', 'Ginekologik'),
(14, '2022-06-21', 2, 30, 'Accept', 'Hematologi'),
(15, '2022-06-22', 1, 24, 'Accept', 'Elektrokardiogram'),
(16, '2022-06-21', 1, 25, 'Declined', 'Elektrokardiogram'),
(17, '2022-06-28', 2, 20, 'Accept', 'Radiologi'),
(18, '2022-06-25', 2, 20, 'Accept', 'Radiologi'),
(19, '2022-06-27', 5, 26, 'Pending', 'USG'),
(20, '2022-06-29', 1, 29, 'Accept', 'Elektrokardiogram'),
(21, '2022-06-02', 0, 0, 'Pending', 'Elektrokardiogram'),
(22, '2022-06-02', 0, 0, 'Pending', 'Elektrokardiogram'),
(23, '2022-06-01', 0, 1, 'Pending', 'Medical Check-Up'),
(24, '2022-06-02', 0, 2, 'Pending', 'Tonometri'),
(25, '2022-06-08', 0, 2, 'Pending', 'Elektrokardiogram');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `Nama` varchar(50) NOT NULL,
  `Alamat` varchar(50) NOT NULL,
  `No.Telepon` varchar(50) NOT NULL,
  `Email` varchar(50) NOT NULL,
  `Tanggal_Lahir` date NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `Nama`, `Alamat`, `No.Telepon`, `Email`, `Tanggal_Lahir`, `username`, `password`) VALUES
(1, 'Risky Kurniawan', 'Lempake', '0877627732732', 'risky@gmail.com', '2002-09-10', 'riskyy', '10risky'),
(2, 'Raymond', 'juandi', '081256375323', 'Raymond@gmail.com', '2002-06-06', 'Raymond', 'raymond'),
(3, 'Rausyan Fikr', 'Jl. Djuanda', '08995325381', 'rausyan@gmail.com', '2001-08-12', 'rausyanfikr', 'rausyan123'),
(4, 'Naufal Wildan', 'Jl. Perjuangan 7', '08863723321', 'opang@gmail.com', '2002-07-03', 'opang03', 'opang123'),
(5, 'Shalsabyla Putri', 'Jl. Alam Segar 4', '08221212123', 'salsa@gmail.com', '2003-09-12', 'salsa_', 'salsa12'),
(6, 'Fathia Nuq Qamarina', 'Jl. Pangeran Antasari 2', '08112238648', 'fatia@gmail.com', '2002-11-28', 'tiafat12', 'fatia_12'),
(7, 'Andi Alfian', 'Jl. Perjuangan 7', '085562362832', 'andi@gmail.com', '2002-12-12', 'andifian', 'andifian2'),
(8, 'Rifky Cahyadi', 'Jl. Pramuka 5', '081222267653', 'iki@gmail.com', '2001-02-28', 'ikiww28', 'rifkycahyadi_'),
(9, 'Muhammad Daffa', 'Samarinda Sebrang', '08121202923', 'daffa@gmail.com', '2001-10-10', 'daffaa', 'daffa_10'),
(10, 'admin', 'admin', 'admin', 'admin', '2022-06-01', 'admin', 'admin'),
(11, 'Sulhairah', 'Jl. Pramuka 15', '085452126821', 'zlhera@gmail.com', '2001-09-17', 'zlheraa', 'hera123'),
(12, 'Mitha Amalia', 'Jl. Wahid Hasyim I', '085624613983', 'mithaas13@gmail.com', '2002-02-13', 'mithaas13', 'apasok13'),
(13, 'Mira Sartika', 'Jl. Wahid Hasyim I', '081223979217', 'mirasl16@gmail.com', '2002-09-16', 'mirasl16', 'SartikaL16'),
(14, 'Alexander Januar Dienc', 'Jl. Suryanata', '0822123231244', 'alexanderjanuar@gmail.com', '2002-06-04', 'alexanderJD', 'Alex123'),
(15, 'Ega Sulfika', 'Jl. M. Yamin', '087878232992', 'egasulfika@gmail.com', '2003-01-10', 'egasulfikji', 'ega1sul10'),
(16, 'Cantika Fitri Ayu Darmayanti', 'Perum Damanhuri', '0822674822946', 'cantikaayu@gmail.com', '2001-12-18', 'CantikaFA', 'cantikcan'),
(17, 'Sevina Afi Amalia', 'Jl. Perjuangan 7', '081213151617', 'sevinaamalia@gmail.com', '2002-04-04', 'sevinaaa', 'sevinaa_'),
(18, 'Yanuar Gideon Simalango', 'Jl. Perjuangan 7', '085778856453', 'yanuargs@gmail.com', '2002-03-17', 'yanuargs_', 'deo17'),
(19, 'Muh Fathir Fahrezah', 'Jl. Sempaja', '0877286927283', 'fathirfahrezah@gmail.com', '2002-06-24', 'fathirfahrezah', 'fathirr24'),
(20, 'Alan Nuzulan', 'Jl. Perjuangan 7 ', '08123222423', 'alannuzulan21@gmail.com', '2001-09-09', 'land21', 'alan21'),
(21, 'Muhammad Arsy Dewantara', 'Jl.Perjuangan 7 ', '081230907822836', 'arsydewantara@gmail.com', '2001-09-09', 'arsydewantara', 'arsyy09'),
(22, '12', '12', '12', '12', '2022-06-01', '12', '12'),
(24, 'hera', 'hera@gmail.com', '123452', 'hera@gmail.com', '2021-06-15', 'hera', '111'),
(25, 'agnia', 'agniaxn@gmail.com', '081295457550', 'agniaxn@gmail.com', '2021-05-03', 'agnia', '123'),
(26, 'Romanno', 'Jl Kompi', '08979867857', 'otan@gmail.com', '2003-08-14', 'Roman', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dokter`
--
ALTER TABLE `dokter`
  ADD PRIMARY KEY (`id_dokter`);

--
-- Indexes for table `janji temu`
--
ALTER TABLE `janji temu`
  ADD PRIMARY KEY (`id_janjiTemu`);

--
-- Indexes for table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
