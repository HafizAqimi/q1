-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 29, 2023 at 06:31 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `prefinal_ipt`
--

-- --------------------------------------------------------

--
-- Table structure for table `data_requirement`
--

CREATE TABLE `data_requirement` (
  `id` int(255) NOT NULL,
  `carPlateNo` varchar(255) DEFAULT NULL,
  `carMake` varchar(255) DEFAULT NULL,
  `carModel` varchar(255) DEFAULT NULL,
  `currentMileage` int(255) DEFAULT NULL,
  `serviceDate` varchar(255) DEFAULT NULL,
  `nextServiceMileage` int(255) DEFAULT NULL,
  `nextServiceDate` varchar(255) DEFAULT NULL,
  `customerName` varchar(255) DEFAULT NULL,
  `customerContactNo` int(255) DEFAULT NULL,
  `remarks` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `data_requirement`
--

INSERT INTO `data_requirement` (`id`, `carPlateNo`, `carMake`, `carModel`, `currentMileage`, `serviceDate`, `nextServiceMileage`, `nextServiceDate`, `customerName`, `customerContactNo`, `remarks`) VALUES
(1, 'QAH1303', 'Toyota', 'AE86', 98763, '01/03/24', 789876, '01/03/25', 'HAFIZ AQIMI BIN JUHAILI', 1123066097, 'Excellent to Drift'),
(2, 'QWS3053', 'Perodua', 'Bezza', 23456, '30/05/24', 45676, '30/05/25', 'ANEESA NATASYA NANA BIT', 128737597, 'Great for Vacation Trip'),
(3, 'QWE3456', 'Nissan', 'Skyline', 34566, '29/02/24', 345432, '11/07/26', 'ARBIDUL MADUL BIN ARBIDUL WASAAH', 1234656778, 'Great for Drag Race');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `data_requirement`
--
ALTER TABLE `data_requirement`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `data_requirement`
--
ALTER TABLE `data_requirement`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
