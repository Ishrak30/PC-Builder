-- phpMyAdmin SQL Dump
-- version 5.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 29, 2020 at 04:36 PM
-- Server version: 10.4.11-MariaDB
-- PHP Version: 7.4.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `userlogin`
--

-- --------------------------------------------------------

--
-- Table structure for table `graphics_card`
--

CREATE TABLE `graphics_card` (
  `gpu_id` int(10) NOT NULL,
  `gpu_name` varchar(255) NOT NULL,
  `gpu_type` varchar(255) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `graphics_card`
--

INSERT INTO `graphics_card` (`gpu_id`, `gpu_name`, `gpu_type`, `price`) VALUES
(5001, 'Colorful GeForce GT710-2GD3-V 2GB Graphics Card', '11000101', 3600),
(5002, 'Zotac GeForce GT 710 2GB DDR3 Graphics Card', '11000101', 4100),
(5003, 'MSI GeForce GT 1030 AERO ITX OC 2GB Graphic Card', '12000101', 8500),
(5004, 'Sapphire Pulse Radeon RX 570 4GB GDDR5 HDMI DP Graphics card', '12000101', 12000),
(5005, 'MSI GeForce GTX 1650 VENTUS XS 4G OC Graphics Card', '13000101', 16500),
(5009, 'Sapphire Pulse Radeon RX 570 8GB GDDR5 Graphics Card', '13000101', 15000),
(5010, 'Zotac Gaming GeForce GTX 1650 Super 4GB GDDR6 Twin Fan Graphics Card', '13000101', 17000),
(5011, 'Sapphire NITRO+ RX 580 4G GDDR5 Graphics Card', '13000101', 17500),
(5012, 'MSI GeForce GTX 1650 GAMING X 4G Graphics Card', '13000101', 18000),
(5013, 'Gigabyte GeForce GTX 1650 Super OC 4GB Graphics Card', '13000101', 19500),
(5014, 'Gigabyte GeForce GTX 1650 Super Windforce OC 4GB Graphics Card', '13000101', 20000),
(5015, 'GALAX GeForce GTX 1660 (1-Click OC) 6GB GDDR5 192-bit Graphics Card', '13000101', 20500),
(5016, 'MSI GeForce GTX 1650 Super Ventus XS 4GB GDDR6 Graphics Card', '13000101', 21000),
(5017, 'Asus Rog Strix RX570 OC edition 4GB GDDR5 Graphics Card', '13000101', 21500),
(5018, 'Gigabyte Radeon RX 5500 XT Gaming OC 4GB Graphics Card', '13000101', 22000),
(5019, 'Zotac Gaming GeForce GTX 1660 AMP 6GB GDDR5 Graphics Card', '13000101', 22500),
(5020, 'Sapphire NITRO+ RX 590 8GB GDDR5 Graphics Card', '13000101', 23000),
(5021, 'ASRock Phantom Gaming X Radeon RX590 8G OC Graphics Card', '13000101', 23500),
(5022, 'Asus Phoenix GeForce GTX 1660 Super 6GB GDDR6 Graphics Card', '13000101', 24000),
(5023, 'Zotac Gaming GeForce GTX 1660 SUPER AMP 6GB GDDR6 Graphics Card', '13000101', 24500),
(5024, 'Gigabyte Radeon RX 5500 XT Gaming OC 8GB Graphics Card', '13000101', 25000),
(5025, 'MSI GeForce GTX 1660 GAMING X 6G Graphics Card', '13000101', 26000),
(5026, 'ASUS TUF Gaming X3 GeForce GTX 1660 Advanced edition 6GB GDDR5', '13000101', 27000),
(5027, 'Gigabyte GeForce GTX 1660 GAMING OC 6GB Graphics Card', '13000101', 28000),
(5028, 'Gigabyte GeForce GTX 1660 Ti GAMING OC 6G Graphics Card', '13000101', 29000),
(5029, 'Asus ROG Strix Radeon RX 590 8GB GDDR5 Graphics Card', '13000101', 30000),
(5030, 'ZOTAC GAMING GeForce RTX 2060 AMP 6GB GDDR6 Graphics Card', '13000101', 31000),
(5031, 'Colorful GeForce RTX 2060 6G V2-V Graghics Card', '13000101', 32000),
(5032, 'Gigabyte Radeon RX 5600 XT Gaming OC 6GB Graphics Card', '13000101', 33000),
(5033, 'Gigabyte GeForce RTX 2060 WINDFORCE OC 6G Graphics Card', '13000101', 35000),
(5034, 'MSI GeForce RTX 2060 VENTUS XS 6G OC Graphics Card', '13000101', 37000),
(5035, 'Gigabyte Radeon RX 5700 Gaming OC 8GB Graphics Card', '13000101', 39000),
(5036, 'Asus Turbo GeForce RTX 2060 6GB GDDR6 Graphics Card', '13000101', 40000),
(5037, 'Asus ROG Strix GeForce RTX 2060 OC edition 6GB GDDR6', '13000101', 41000),
(5038, 'Zotac Gaming GeForce RTX 2060 8GB GDDR6 Super Mini Graphics Card', '13000101', 42000),
(5039, 'MSI Radeon RX 5700 XT MECH OC 8GB Graphics Card', '13000101', 43000),
(5040, 'Sapphire Pulse Radeon RX 5700 XT 8GB GDDR6 Graphics Card', '13000101', 44000),
(5041, 'Zotac Gaming Geforce RTX2060 Super AMP 8GB GDDR6 Graphics Card', '13000101', 45000),
(5042, 'Asus Dual GeForce RTX 2060 OC edition 6GB GDDR6 Graphics Card', '13000101', 46000);

-- --------------------------------------------------------

--
-- Table structure for table `login`
--

CREATE TABLE `login` (
  `serial` int(11) NOT NULL,
  `email` varchar(500) NOT NULL,
  `password` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login`
--

INSERT INTO `login` (`serial`, `email`, `password`) VALUES
(1, 'qwe', 'qwe'),
(11, 'ishrakhussain30@gmail.com', '123456');

-- --------------------------------------------------------

--
-- Table structure for table `motherboard`
--

CREATE TABLE `motherboard` (
  `mb_id` int(10) NOT NULL,
  `mb_name` varchar(255) NOT NULL,
  `type` varchar(10) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `motherboard`
--

INSERT INTO `motherboard` (`mb_id`, `mb_name`, `type`, `price`) VALUES
(2001, 'Asus PRIME H310M-E R2.0 8th Gen mATX Motherboard', '11000101', 7200),
(2002, 'Gigabyte GA-A320M-S2H AMD Micro ATX Motherboard', '12000101', 5300),
(2003, 'Asus TUF Gaming X570 Plus AM4 ATX Motherboard', '13000101', 20500),
(2004, 'Asus TUF B450M-PLUS GAMING DDR4 AMD AM4 Motherboard', '13000101', 9900),
(2005, 'Asus Prime J3355I-C DDR3 Mini ITX Motherboard', '11000101', 5500),
(2006, 'ASRock A320M-HDV R4.0 AMD Motherboard', '12000101', 5600),
(2008, 'Gigabyte GA-H110M-DS2V Motherboard', '11000101', 5200),
(2009, 'ASRock A320M-HDV R4.0 AMD Motherboard', '12000101', 5600),
(2010, 'MSI A320M-A Pro Max AMD Motherboard', '12000101', 6000),
(2011, 'Asus Tinker Board With Rockchip Quad-Core RK3288', '11000101', 5800),
(2012, 'Asus H110M-E/M.2 DDR4 USB 3.0 ATX Motherboard', '13000101', 6000),
(2013, 'MSI H310M Gaming Arctic 8th Gen DDR4 Motherboard', '13000101', 6200),
(2014, 'Gigabyte H310M S2 8th Gen Micro ATX Motherboard', '11000101', 6400),
(2015, 'MSI B450M-A PRO MAX AMD AM4 Motherboard', '12000101', 6500),
(2016, 'ASRock H310CM-HDV 9th Gen Micro ATX Motherboard', '11000101', 6900),
(2017, 'MSI H310M Pro-M2 Plus Intel 9th Gen Motherboard', '13000101', 7000),
(2018, 'MSI B450M PRO-M2 MAX AMD AM4', '12000101', 7000),
(2019, 'Asrock H310CM-HDV/M.2 8th & 9th Gen DDR4 Motherboard', '11000101', 7100),
(2020, 'Gigabyte AMD B450M Motherboard', '12000101', 7500),
(2021, 'ASUS PRIME B250M-K DDR4 ATX Motherboard', '13000101', 7200),
(2022, 'MSI B360M PRO-VH DDR4 8th/9th Gen LGA1151 Socket Motherboard', '11000101', 7400),
(2023, 'Asus PRIME B450M-K DDR4 AMD AM4 Socket Motherboard', '12000101', 7500),
(2024, 'Gigabyte B360M D3V 8th Gen Motherboard', '13000101', 7500),
(2025, 'MSI B450M PRO-VDH MAX AMD AM4', '12000101', 8000),
(2026, 'Gigabyte Z390 GAMING X 9th Gen ATX Motherboard', '13000101', 15000),
(2027, 'Gigabyte B365M D3H DDR4 Intel LGA1151 Socket Motherboard', '13000101', 8500),
(2028, 'Asus TUF B450-PLUS GAMING AMD ATX Motherboard', '13000101', 9000),
(2029, 'Asus TUF B360M-E GAMING 8th Gen mATX Motherboard', '13000101', 9500),
(2030, 'Asrock B450M Steel Legend AMD Motherboard', '13000101', 9900),
(2031, 'Asrock B365M Phantom Gaming 4 9th Gen Motherboard', '13000101', 10000),
(2032, 'Gigabyte AMD B450 Gaming X Motherboard', '13000101', 10500),
(2033, 'Gigabyte B450 AORUS ELITE AMD ATX Motherboard', '13000101', 11000),
(2034, 'Asus ROG Strix B365-G Gaming RGB 8th/9th Gen LGA1151 ATX', '13000101', 11500),
(2035, 'Gigabyte Z390 M GAMING 9th Gen Micro ATX Motherboard', '13000101', 12500),
(2036, 'Asus TUF B365M-Plus Gaming Wi-Fi LGA1151 9TH Gen Micro ATX Motherboard', '13000101', 13000),
(2037, 'Asus ROG STRIX B360-I GAMING 8th Gen mini-ITX Motherboard', '13000101', 14000);

-- --------------------------------------------------------

--
-- Table structure for table `power_supply`
--

CREATE TABLE `power_supply` (
  `psu_id` int(10) NOT NULL,
  `psu_name` varchar(255) NOT NULL,
  `psu_type` varchar(255) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `power_supply`
--

INSERT INTO `power_supply` (`psu_id`, `psu_name`, `psu_type`, `price`) VALUES
(6001, 'MaxGreen 500 Watt power supply', '11000101', 900),
(6007, 'Antec Atom 350W 350 Watt Power Supply', '11000101', 2000),
(6008, 'Antec Atom 550W 550 Watt Power Supply', '12000101', 2500),
(6009, 'Cooler Master Elite V3 400w Power Supply', '11000101', 3000),
(6010, 'Thermaltake Litepower 550W Sleeve Cable Power Supply', '12000101', 3500),
(6011, 'Corsair VS450 450W 80 Plus White Certified Non-Modular Power Supply', '12000101', 3000),
(6012, 'Gamdias Kratos E1-500 500 Watt RGB Power Supply', '11000101', 3500),
(6013, 'Antec VP500P Plus 500 Watt Power Supply', '12000101', 4000),
(6014, 'Gamdias ASTRAPE M1-650W Power Supply', '11000101', 4500),
(6015, 'Gamdias Kratos M1-600B 600 Watt 80+ Bronze Addressable RGB Power Supply', '13000101', 4500),
(6016, 'Corsair VS650 650W 80 Plus Non-Modular Power Supply', '12000101', 5000),
(6017, 'Cooler Master MWE 550 Watt Non Modular 80 Plus Bronze Certified Power Supply', '11000101', 5500),
(6018, 'Antec Neo Eco Gold Zen 500W Non Modular Power Supply', '13000101', 6000),
(6019, 'Gamdias KRATOS P1 650G 80+ Gold ATX Power Supply', '13000101', 7000),
(6020, 'Corsair TX650M 650 Watt 80 Plus Gold Certified Semi-Modular Power Supply', '13000101', 7500),
(6021, 'Gamdias KRATOS P1 750G 750W Semi Modular ATX Power Supply', '13000101', 8000),
(6022, 'Gigabyte G750H 750W Semi Moduler 80 Plus Gold Certified Power Supply', '13000101', 8500),
(6023, 'Antec HCG-750 Gold Series 750W Full Modular Power Supply', '13000101', 9000),
(6024, 'Cooler Master MWE 750W Fully Modular 80 PLUS Gold Certified Power Supply', '13000101', 9500),
(6025, 'Corsair TX750M 750W 80 Plus Gold Certified Semi-Modular Power Supply', '13000101', 10000),
(6026, 'Antec HCG 850 EC Gold High Current Gamer Gold Series 850W Power supply', '13000101', 11000);

-- --------------------------------------------------------

--
-- Table structure for table `processor`
--

CREATE TABLE `processor` (
  `processor_Id` int(10) NOT NULL,
  `processor_name` varchar(255) NOT NULL,
  `type_id` varchar(10) NOT NULL,
  `Price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `processor`
--

INSERT INTO `processor` (`processor_Id`, `processor_name`, `type_id`, `Price`) VALUES
(1001, 'AMD Athlon 200GE AM4 Socket Desktop Processor with Radeon Vega 3 Graphics', '12000101', 5300),
(1002, 'AMD Ryzen 3 3200G Processor with Radeon RX Vega 8 Graphics', '12000101', 9500),
(1003, 'Intel 9th Gen Core i3 9100F Processor(no single)', '11000101', 8300),
(1004, 'Intel 9th Gen Core i3 9100 Processor', '11000101', 11800),
(1005, 'Intel 9th Generation Core i5-9600K Processor', '13000101', 22500),
(1006, 'Intel 9th Generation Core i7-9700F Processor (No Single)', '13000101', 32000),
(1007, 'Intel 9th Gen Core i5 9400F Processor (No Single )', '13000101', 14500),
(1008, 'Intel Pentium Gold G5420 8th gen Coffee Lake Processor', '11000101', 5100),
(1009, 'Intel 8th Generation Core i3-8100 Processor (No Single)', '11000101', 10500),
(1010, 'Intel 7th Generation Pentium Processor G4560', '12000101', 5500),
(1011, 'Intel 7th Generation Core i3-7100 Processor', '11000101', 11500),
(1012, 'Intel 7th Generation Core i5-7400 Processor', '13000101', 15000),
(1013, 'Intel 7th Generation Core i5-7500 Processor', '13000101', 17500),
(1014, 'Intel 8th Generation Core i5-8400 Processor', '13000101', 18000),
(1015, 'Intel 9th Gen Core i5-9400 Processor', '11000101', 20000),
(1016, 'Intel 9th Generation Core i5-9600K Processor', '13000101', 22500),
(1017, 'Intel 7th Generation Core i7-7700 Processor', '13000101', 25000),
(1018, 'AMD Ryzen 3 2200G Quad-Core Processor With Radeon Vega 8 Graphics', '12000101', 8200),
(1019, 'AMD Ryzen 3 1300X Processor', '12000101', 10000),
(1020, 'AMD Ryzen 5 2600 Processor', '12000101', 12000),
(1021, 'AMD Ryzen 5 3400G Processor with Radeon RX Vega 11 Graphics', '12000101', 15000),
(1022, 'AMD Ryzen 5 3600 Processor', '12000101', 18000),
(1023, 'AMD Ryzen 5 3600X Processor', '12000101', 22000),
(1024, 'AMD Ryzen 7 3700X Processor', '12000101', 26000),
(1025, 'AMD Ryzen Threadripper 1900X 8-core/16 thread', '13000101', 35000),
(1026, 'AMD Ryzen Threadripper 1920X 12-core/24-thread Desktop Processor', '13000101', 45000);

-- --------------------------------------------------------

--
-- Table structure for table `ram`
--

CREATE TABLE `ram` (
  `ram_Id` int(10) NOT NULL,
  `ram_name` varchar(255) NOT NULL,
  `type` varchar(10) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ram`
--

INSERT INTO `ram` (`ram_Id`, `ram_name`, `type`, `price`) VALUES
(3001, 'Avexir 4GB 1600MHz DDR3 RAM', '11000101', 1800),
(3002, 'GeIL PRISTINE 4GB 2400MHz DDR4 RAM', '11000101', 2200),
(3003, 'Corsair Vengeance LPX 4GB (1x4GB) DDR4 DRAM 2400MHz', '12000101', 2600),
(3004, 'GeIL PRISTINE 8GB 2400MHz DDR4 RAM', '12000101', 3300),
(3005, 'Corsair Vengeance LPX 8GB DDR4 DRAM 2666MHz Ram', '13000101', 3600),
(3006, 'TEAM DELTA UD 8GB 2666MHz RGB DDR4 Desktop RAM', '13000101', 4000),
(3008, 'TwinMOS 2GB DDR3 1333 MHz', '11000101', 1400),
(3009, 'TwinMOS 2GB DDR3 1600 MHz', '11000101', 1500),
(3010, 'Transcend 4GB DDR3 1333 MHz Desktop RAM', '12000101', 2000),
(3011, 'GeIL PRISTINE 4GB 2400MHz DDR4 RAM', '12000101', 2000),
(3012, 'Team Elite Plus 4GB 2400MHz DDR4 Ram', '12000101', 2500),
(3013, 'TEAM ELITE U-Dimm 4GB 2400MHz DDR4 RAM', '11000101', 2500),
(3014, 'TEAM DELTA UD 4GB 2666MHz RGB DDR4 Desktop RAM', '12000101', 2700),
(3015, 'Adata 8GB DDR3 1600 Mhz Ram', '12000101', 3000),
(3016, 'Adata 8GB DDR3 1600 Mhz Ram', '11000101', 3000),
(3017, 'Crucial 8GB Single DDR4 2400MHz UDIMM RAM', '12000101', 3200),
(3018, 'PATRIOT 8GB DDR4 2400MHz Desktop RAM', '13000101', 3200),
(3019, 'TEAM Elite U-Dimm 8GB 1600MHz DDR3 RAM', '12000101', 3500),
(3020, 'Patriot 8GB DDR4 2666MHz Desktop Ram', '11000101', 3800),
(3021, 'Adata 8 GB DDR4 2400 BUS Desktop Ram', '12000101', 4000),
(3022, 'Corsair Vengeance LPX 8GB 3200MHz DDR4 Desktop RAM', '13000101', 4000),
(3023, 'GEIL EVO SPEAR 8GB 2666MHz DDR4 Single Channel Ram', '12000101', 4300),
(3024, 'GEIL Evo Spear 8GB 3200 MHz RAM', '13000101', 4500),
(3025, 'Adata Gammix D10 8GB DDR4 2400 BUS Desktop RAM', '12000101', 5000),
(3026, 'Corsair Vengeance RGB Pro 8GB DDR4 3200MHz Ram', '13000101', 5000),
(3027, 'Corsair 8 GB DDR4 3200MHZ RGB Ram', '13000101', 5500),
(3028, 'Corsair Vengeance® LPX 16GB DDR4 DRAM 2400MHz Ram', '13000101', 6000),
(3029, 'Team Elite Plus 16GB DDR4 2400MHz RAM', '13000101', 6500),
(3030, 'Corsair Vengeance LPX 16GB DDR4 DRAM 3200MHz Ram', '13000101', 7000),
(3031, 'Corsair Vengeance RGB Pro 16GB DDR4 3200MHz Ram', '13000101', 7500),
(3032, 'Team Dark 16GB (8GBX2) DDR4 3200 Mhz Gaming Desktop Memory', '13000101', 8000),
(3033, 'Team T-FORCE DARK Zα 16GB (8GBx2) DDR4 3600MHz Gaming RAM', '13000101', 8500),
(3034, 'TEAM DARK PRO UD 8GBx2 3200MHz DDR4 Desktop RAM', '13000101', 9000),
(3035, 'Team Delta RGB 16 GB (2 x 8 GB) DDR4 3200MHz Desktop Ram', '13000101', 9500),
(3036, 'TEAM NIGHT HAWK UD 8GBx2 3200MHz RGB DDR4 Desktop RAM', '13000101', 10000),
(3037, 'Gigabyte AORUS RGB 16GB (2X8GB) 3600MHz Desktop RAM', '13000101', 11000),
(3038, 'Corsair Dominator Platinum RGB 16GB (2 x 8GB) 3200MHz DDR4 DRAM', '13000101', 11500),
(3039, 'Gigabyte AORUS RGB 16GB (2X8GB) 3600MHz Desktop RAM with Demo Kit', '13000101', 12000),
(3040, 'TEAM XCALIBUR UD 8GBx2 3600MHz RGB DDR4 Desktop RAM', '13000101', 13000),
(3041, 'Team Dark 32GB (16GBX2) DDR4 3200Mhz Gaming Desktop Memory', '13000101', 14000);

-- --------------------------------------------------------

--
-- Table structure for table `save_build`
--

CREATE TABLE `save_build` (
  `serial_no` int(11) NOT NULL,
  `email` varchar(255) NOT NULL,
  `processor` varchar(255) NOT NULL,
  `motherboard` varchar(255) NOT NULL,
  `graphics_card` varchar(255) NOT NULL,
  `ram` varchar(255) NOT NULL,
  `storage` varchar(255) NOT NULL,
  `psu` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `storage`
--

CREATE TABLE `storage` (
  `storage_Id` int(10) NOT NULL,
  `storage_name` varchar(255) NOT NULL,
  `storage_type` varchar(255) NOT NULL,
  `price` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `storage`
--

INSERT INTO `storage` (`storage_Id`, `storage_name`, `storage_type`, `price`) VALUES
(4001, 'Western Digital 1TB Purple Desktop HDD', '12000101', 4000),
(40008, 'Toshiba 512GB Sata Desktop Hard Disk', '12000101', 2500),
(40009, 'Western Digital 512GB Blue Desktop HDD', '11000101', 2500),
(40010, 'Toshiba 1TB Sata Desktop Hard Disk', '12000101', 3000),
(40011, 'Western Digital 1TB Blue Desktop HDD', '11000101', 3000),
(40012, 'Seagate SkyHawk 1TB 3.5\" Surveillance Hard Drive', '12000101', 3500),
(40013, 'Western Digital 1TB Purple Desktop HDD', '12000101', 4000),
(40014, 'Toshiba 2TB Sata Desktop Hard Disk', '12000101', 5000),
(40015, 'Seagate Barracuda 2TB SATA 3.5 inch HDD', '12000101', 5500),
(40016, 'Seagate SkyHawk 3TB 3.5\" Surveillance Hard Drive', '12000101', 7000),
(40017, 'ADATA SU650 120GB M.2 2280 SATA 3D NAND Internal SSD', '11000101', 1900),
(40018, 'TEAM GX2 2.5\" SATA 128GB SSD', '11000101', 2000),
(40019, 'Western Digital 120GB M.2 SSD', '11000101', 2500),
(40020, 'Gigabyte M.2 PCIe SSD 128GB', '11000101', 2700),
(40021, 'TEAM GX2 2.5\" SATA 240GB SSD', '11000101', 3000),
(40022, 'TEAM GX2 2.5\" SATA 256GB SSD', '11000101', 3300),
(40023, 'PNY CS2040 256GB M.2 2280 SSD', '11000101', 3500),
(40024, 'Toshiba 1TB Sata Desktop Hard Disk', '11000101', 3600),
(40025, 'Western Digital 1TB Blue Desktop HDD', '11000101', 3700),
(40026, 'Western Digital 1TB Purple Desktop HDD', '11000101', 4000),
(40027, 'Corsair Force MP510 240 GB NVMe PCIe Gen3 M.2 SSD', '11000101', 5000),
(40028, 'Toshiba 2TB Sata Desktop Hard Disk', '13000101', 5200),
(40029, 'COLORFUL SL500 512GB 2.5\' SATA III SSD', '13000101', 5300),
(40030, 'Western Digital Green 480GB SSD', '13000101', 5500),
(40031, 'TEUTONS IRIDIUM 2280 512GB M.2 SSD', '13000101', 6000),
(40032, 'Gigabyte UD PRO 512GB Solid State Drive (SSD)', '13000101', 6500),
(40033, 'Adata XPG SX6000 Pro 512GB PCIe Gen3x4 M.2 2280 NVMe SSD', '13000101', 7000),
(40034, 'Transcend 230S 512GB 2.5 Inch SATA III SSD', '13000101', 7500),
(40035, 'Corsair Force MP510 480 GB NVMe PCIe Gen3 M.2 SSD', '13000101', 8000),
(40036, 'TRANSCEND 512GB 220S NVME PCIE M.2 SSD', '13000101', 8500),
(40037, 'Gigabyte 512GB Aorus RGB M.2 NVMe SSD', '13000101', 10000),
(40038, 'Samsung 860 QVO 1TB 2.5” SATA III SSD', '13000101', 10500),
(40039, 'Transcend 830S M.2 1TB SSD', '13000101', 11000),
(40040, 'Western Digital (Green) 1TB SATA SSD', '13000101', 12000),
(40041, 'Seagate IronWolf 4TB SATA NAS HDD', '11000101', 12500);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `graphics_card`
--
ALTER TABLE `graphics_card`
  ADD PRIMARY KEY (`gpu_id`);

--
-- Indexes for table `login`
--
ALTER TABLE `login`
  ADD PRIMARY KEY (`serial`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `motherboard`
--
ALTER TABLE `motherboard`
  ADD PRIMARY KEY (`mb_id`);

--
-- Indexes for table `power_supply`
--
ALTER TABLE `power_supply`
  ADD PRIMARY KEY (`psu_id`);

--
-- Indexes for table `processor`
--
ALTER TABLE `processor`
  ADD PRIMARY KEY (`processor_Id`);

--
-- Indexes for table `ram`
--
ALTER TABLE `ram`
  ADD PRIMARY KEY (`ram_Id`);

--
-- Indexes for table `save_build`
--
ALTER TABLE `save_build`
  ADD PRIMARY KEY (`serial_no`);

--
-- Indexes for table `storage`
--
ALTER TABLE `storage`
  ADD PRIMARY KEY (`storage_Id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `graphics_card`
--
ALTER TABLE `graphics_card`
  MODIFY `gpu_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5043;

--
-- AUTO_INCREMENT for table `login`
--
ALTER TABLE `login`
  MODIFY `serial` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `motherboard`
--
ALTER TABLE `motherboard`
  MODIFY `mb_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2038;

--
-- AUTO_INCREMENT for table `power_supply`
--
ALTER TABLE `power_supply`
  MODIFY `psu_id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6027;

--
-- AUTO_INCREMENT for table `processor`
--
ALTER TABLE `processor`
  MODIFY `processor_Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1027;

--
-- AUTO_INCREMENT for table `ram`
--
ALTER TABLE `ram`
  MODIFY `ram_Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3042;

--
-- AUTO_INCREMENT for table `save_build`
--
ALTER TABLE `save_build`
  MODIFY `serial_no` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `storage`
--
ALTER TABLE `storage`
  MODIFY `storage_Id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40042;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
