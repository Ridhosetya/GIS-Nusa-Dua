-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Waktu pembuatan: 06 Jun 2021 pada 13.32
-- Versi server: 10.4.6-MariaDB
-- Versi PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbpeta`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `t_data`
--

CREATE TABLE `t_data` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `alamat` varchar(200) NOT NULL,
  `jumlahkeluarga` varchar(50) NOT NULL,
  `pekerjaan` varchar(100) NOT NULL,
  `latitude` double NOT NULL,
  `longitude` double NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `t_data`
--

INSERT INTO `t_data` (`id`, `nama`, `alamat`, `jumlahkeluarga`, `pekerjaan`, `latitude`, `longitude`) VALUES
(1, 'Kadek Okta', 'Jl. Siligita Atas, Nusa Dua', '5 Orang', 'Sopir Taxi', -8.803264634313038, 115.2164944140348),
(2, 'Ketut Sura', 'Jl. Bualu Indah, Nusa Dua', '8 Orang', 'Pedagang', -8.801150329907898, 115.21867730158483),
(3, 'Wayan Rudi', 'Jl. Flamboyan VIII, Nusa Dua', '4 Orang', 'Ojek Online', -8.800904799644039, 115.21824866813287),
(4, 'Putu Yasa', 'Jl. ITDC Nusa Dua Lot', '4 Orang', 'Petani', -8.806339784847223, 115.2232086926937),
(5, 'Ketut Badrul', 'Jl. Trompong, Nusa Dua', '6 Orang', 'Kuli Bangunan', -8.807472963081565, 115.22285463576323),
(6, 'Nyoman Bontot', 'Jl. Srikandi, Nusa Dua', '5 Orang', 'Petani Bawang', -8.804651472301957, 115.223280582385),
(7, 'Putu Subagya', 'Jl. Calonarang, Nusa Dua', '4 Orang', 'Pedagang', -8.80054889132585, 115.22374186252505),
(8, 'Made Wartana', 'Jl. Teruna jaya, Nusa Dua', '7 Orang', 'Pedagang', -8.79977030959969, 115.22357599801502),
(9, 'Ahmad Nurmantyo', 'Jl. Desa Sawangan, Nusa Dua', '9 Orang', 'Kuli Bangunan', -8.818687067168618, 115.2149869127919),
(10, 'Kadek Martina', 'Jl. Pantai Mengiat, Nusa Dua', '4 Orang', 'Nelayan', -8.802236446034893, 115.23385411656214),
(11, 'Paulus', 'Jl. Raya Nusa Dua Selatan', '4 Orang', 'Petani', -8.813414950876286, 115.22309629274707),
(12, 'Made Dirga', 'Jl. Dwarawati', '5 Orang', 'Pedagang', -8.800235123758105, 115.22173164993005),
(13, 'Nyoman Pati', 'Jl. Awangga, Nusa Dua', '5 Orang', 'Pedagang', -8.799188562282941, 115.221223028369),
(14, 'Martinus', 'Jl Kuruksetra Gg. Pandawa, Nusa Dua', '6 Orang', 'Ojek Online', -8.79853539921696, 115.21977090652199),
(15, 'Made Kakap', 'Jl. Wirayuda, Nusa Dua', '4 Orang', 'Nelayan', -8.798627258796978, 115.22494942340238);

--
-- Indexes for dumped tables
--

--
-- Indeks untuk tabel `t_data`
--
ALTER TABLE `t_data`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT untuk tabel yang dibuang
--

--
-- AUTO_INCREMENT untuk tabel `t_data`
--
ALTER TABLE `t_data`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
