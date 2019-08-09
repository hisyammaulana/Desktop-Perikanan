-- phpMyAdmin SQL Dump
-- version 4.6.6deb5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: 05 Agu 2019 pada 10.51
-- Versi Server: 5.7.27-0ubuntu0.18.04.1
-- PHP Version: 7.2.19-0ubuntu0.18.04.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `db_perikanan`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_desa`
--

CREATE TABLE `tbl_desa` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `id_kecamatan` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_kecamatan`
--

CREATE TABLE `tbl_kecamatan` (
  `id` int(11) NOT NULL,
  `kode` varchar(5) NOT NULL,
  `nama` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_kecamatan`
--

INSERT INTO `tbl_kecamatan` (`id`, `kode`, `nama`) VALUES
(1, '110', 'Tanjung'),
(2, '010', 'Salem'),
(3, '170-A', 'Brebes'),
(4, '170-B', 'Brebes 2'),
(5, '100', 'Losari'),
(6, '130', 'Bulakamba'),
(7, '170-C', 'Brebes 3'),
(8, '160', 'Jatibarang'),
(9, '150', 'Songgom');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_kolam`
--

CREATE TABLE `tbl_kolam` (
  `id` int(11) NOT NULL,
  `desa` varchar(20) NOT NULL,
  `kecamatan` varchar(20) NOT NULL,
  `bulan` varchar(20) NOT NULL,
  `penyuluh` varchar(50) NOT NULL,
  `pro_lele` int(11) NOT NULL,
  `nill_lele` int(11) NOT NULL,
  `pro_nila` int(11) NOT NULL,
  `nil_nila` int(11) NOT NULL,
  `pro_kaper` int(11) NOT NULL,
  `nil_kaper` int(11) NOT NULL,
  `pro_nilem` int(11) NOT NULL,
  `nil_nilem` int(11) NOT NULL,
  `pro_gurame` int(11) NOT NULL,
  `nil_gurame` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_kolam`
--

INSERT INTO `tbl_kolam` (`id`, `desa`, `kecamatan`, `bulan`, `penyuluh`, `pro_lele`, `nill_lele`, `pro_nila`, `nil_nila`, `pro_kaper`, `nil_kaper`, `pro_nilem`, `nil_nilem`, `pro_gurame`, `nil_gurame`) VALUES
(1, 'sdfgh', 'BANTARKAWUNG', 'APRIL', 'ENCANG SUDRAJAT, S.PI', 123, 121, 21, 2112, 211, 2121, 211, 211, 212, 211);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_luas_lahan_rtp`
--

CREATE TABLE `tbl_luas_lahan_rtp` (
  `id` int(11) NOT NULL,
  `desa` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `penyuluh` varchar(70) NOT NULL,
  `bulan` varchar(20) NOT NULL,
  `jml_rtp_tambak` int(11) NOT NULL,
  `luas_tradisional` int(11) NOT NULL,
  `luas_semi_intensif` int(11) NOT NULL,
  `luas_intensif` int(11) NOT NULL,
  `jml_rtp_kolam` int(11) NOT NULL,
  `luas_kolam` int(11) NOT NULL,
  `jml_rtp_rumput_laut` int(11) NOT NULL,
  `luas_lahan_rumput_laut` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_luas_lahan_rtp`
--

INSERT INTO `tbl_luas_lahan_rtp` (`id`, `desa`, `kecamatan`, `penyuluh`, `bulan`, `jml_rtp_tambak`, `luas_tradisional`, `luas_semi_intensif`, `luas_intensif`, `jml_rtp_kolam`, `luas_kolam`, `jml_rtp_rumput_laut`, `luas_lahan_rumput_laut`) VALUES
(1, 'asnakmnsa', '--- Pilih Kecamatan ---', 'ARWANI AMIN', 'Juni', 121, 12121, 21, 2121, 211, 211, 1212, 211),
(2, 'Jatibarang', 'BANJARHARJO', 'IKHWAN KORIBUDIN, S.PI', 'Mei', 12, 11, 21, 21, 21, 21, 21, 21),
(3, 'Lalala', 'BANTARKAWUNG', 'IKHWAN KORIBUDIN, S.PI', 'Juni', 123, 123, 123, 123, 123, 123, 123, 123),
(4, 'jahjsh', 'BREBES', 'ARWANI AMIN', 'MEI', 11, 11, 11, 11, 11, 11, 11, 11),
(5, 'FDGHJ', 'BUMIAYU', 'YULI EVA MULYANI', 'MEI', 1, 1, 11, 111, 111, 111, 11, 111),
(6, 'SDDS', 'BULAKAMBA', 'YULI FITRIA NURSIAM, S.PI', 'MEI', 11, 11, 11, 11, 11, 11, 11, 11);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_penyuluh`
--

CREATE TABLE `tbl_penyuluh` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `no_hp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_penyuluh`
--

INSERT INTO `tbl_penyuluh` (`id`, `nama`, `no_hp`) VALUES
(1, 'IKHWAN KORIBUDIN, S.PI', ''),
(2, 'ARWANI AMIN', ''),
(3, 'YULI FITRIA NURSIAM, S.PI', ''),
(4, 'YULI EVA MULYANI', ''),
(5, 'ENCANG SUDRAJAT, S.PI', ''),
(6, 'EKO HADIYANTO, S.PI', ''),
(7, 'ABDUL JAMIL, S.PI,M.M', '');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_produksi_benih`
--

CREATE TABLE `tbl_produksi_benih` (
  `id` int(11) NOT NULL,
  `nama` varchar(100) NOT NULL,
  `desa` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `penyuluh` varchar(50) NOT NULL,
  `bulan` varchar(20) NOT NULL,
  `luas_lahan` int(11) NOT NULL,
  `pro_udang_windu` int(11) NOT NULL,
  `nil_udang_windu` int(11) NOT NULL,
  `pro_udang_vaname` int(11) NOT NULL,
  `nil_udang_vaname` int(11) NOT NULL,
  `pro_nila` int(11) NOT NULL,
  `nil_nila` int(11) NOT NULL,
  `pro_bandeng` int(11) NOT NULL,
  `nil_bandeng` int(11) NOT NULL,
  `pro_lele` int(11) NOT NULL,
  `nil_lele` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_produksi_benih`
--

INSERT INTO `tbl_produksi_benih` (`id`, `nama`, `desa`, `kecamatan`, `penyuluh`, `bulan`, `luas_lahan`, `pro_udang_windu`, `nil_udang_windu`, `pro_udang_vaname`, `nil_udang_vaname`, `pro_nila`, `nil_nila`, `pro_bandeng`, `nil_bandeng`, `pro_lele`, `nil_lele`) VALUES
(1, 'sdfg', 'dfgh', 'BREBES', 'IKHWAN KORIBUDIN, S.PI', 'MARET', 23, 121, 211, 21, 21, 21, 21, 21, 21, 121, 21),
(2, 'AGHAAA', 'AJAJ', 'BREBES', 'ARWANI AMIN', 'FEBRUARI', 121, 313, 31, 31, 31, 31, 31, 31, 131, 31, 31);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_produksi_pengolahan`
--

CREATE TABLE `tbl_produksi_pengolahan` (
  `id` int(11) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `penyuluh` varchar(50) NOT NULL,
  `bulan` varchar(50) NOT NULL,
  `alamat` varchar(100) NOT NULL,
  `jenis_olahan` varchar(100) NOT NULL,
  `produk_olahan` varchar(100) NOT NULL,
  `produksi` int(11) NOT NULL,
  `nil_produksi` int(11) NOT NULL,
  `keterangan` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_produksi_pengolahan`
--

INSERT INTO `tbl_produksi_pengolahan` (`id`, `nama`, `kecamatan`, `penyuluh`, `bulan`, `alamat`, `jenis_olahan`, `produk_olahan`, `produksi`, `nil_produksi`, `keterangan`) VALUES
(1, 'hisyammaualan', 'BANTARKAWUNG', 'YULI EVA MULYANI', 'JANUARI', 'akak', 'nama', 'aka', 11, 212121, 'kmklmskamkds'),
(2, 'SD', 'BANJARHARJO', 'EKO HADIYANTO, S.PI', 'FEBRUARI', 'DS', 'DSSD', 'DSDS', 12, 12, '21');

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_produksi_tambak`
--

CREATE TABLE `tbl_produksi_tambak` (
  `id` int(11) NOT NULL,
  `desa` varchar(50) NOT NULL,
  `kecamatan` varchar(50) NOT NULL,
  `penyuluh` varchar(50) NOT NULL,
  `bulan` varchar(20) NOT NULL,
  `pro_rumput_laut` int(11) NOT NULL,
  `nil_rumput_laut` int(11) NOT NULL,
  `pro_udang_windu` int(11) NOT NULL,
  `nil_udang_windu` int(11) NOT NULL,
  `pro_udang_vaname_sederhana` int(11) NOT NULL,
  `nil_udang_vaname_sederhana` int(11) NOT NULL,
  `pro_udang_vaname_semi` int(11) NOT NULL,
  `nil_udang_vaname_semi` int(11) NOT NULL,
  `pro_udang_vaname_intensif` int(11) NOT NULL,
  `nil_udang_vaname_intensif` int(11) NOT NULL,
  `pro_udang_putih` int(11) NOT NULL,
  `nil_udang_putih` int(11) NOT NULL,
  `pro_udang_lokal` int(11) NOT NULL,
  `nil_udang_lokal` int(11) NOT NULL,
  `pro_bandeng` int(11) NOT NULL,
  `nil_bandeng` int(11) NOT NULL,
  `pro_lele` int(11) NOT NULL,
  `nil_lele` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `tbl_produksi_tambak`
--

INSERT INTO `tbl_produksi_tambak` (`id`, `desa`, `kecamatan`, `penyuluh`, `bulan`, `pro_rumput_laut`, `nil_rumput_laut`, `pro_udang_windu`, `nil_udang_windu`, `pro_udang_vaname_sederhana`, `nil_udang_vaname_sederhana`, `pro_udang_vaname_semi`, `nil_udang_vaname_semi`, `pro_udang_vaname_intensif`, `nil_udang_vaname_intensif`, `pro_udang_putih`, `nil_udang_putih`, `pro_udang_lokal`, `nil_udang_lokal`, `pro_bandeng`, `nil_bandeng`, `pro_lele`, `nil_lele`) VALUES
(1, 'acvbna', 'BANTARKAWUNG', 'YULI EVA MULYANI', 'Maret', 11, 11, 2, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 11, 111, 11, 11);

-- --------------------------------------------------------

--
-- Struktur dari tabel `tbl_wil_kerja`
--

CREATE TABLE `tbl_wil_kerja` (
  `id` int(11) NOT NULL,
  `id_penyuluh` int(11) NOT NULL,
  `id_desa` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_desa`
--
ALTER TABLE `tbl_desa`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_kecamatan`
--
ALTER TABLE `tbl_kecamatan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_kolam`
--
ALTER TABLE `tbl_kolam`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_luas_lahan_rtp`
--
ALTER TABLE `tbl_luas_lahan_rtp`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_penyuluh`
--
ALTER TABLE `tbl_penyuluh`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_produksi_benih`
--
ALTER TABLE `tbl_produksi_benih`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_produksi_pengolahan`
--
ALTER TABLE `tbl_produksi_pengolahan`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_produksi_tambak`
--
ALTER TABLE `tbl_produksi_tambak`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_wil_kerja`
--
ALTER TABLE `tbl_wil_kerja`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_desa`
--
ALTER TABLE `tbl_desa`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `tbl_kecamatan`
--
ALTER TABLE `tbl_kecamatan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
--
-- AUTO_INCREMENT for table `tbl_kolam`
--
ALTER TABLE `tbl_kolam`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tbl_luas_lahan_rtp`
--
ALTER TABLE `tbl_luas_lahan_rtp`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tbl_penyuluh`
--
ALTER TABLE `tbl_penyuluh`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tbl_produksi_benih`
--
ALTER TABLE `tbl_produksi_benih`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_produksi_pengolahan`
--
ALTER TABLE `tbl_produksi_pengolahan`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_produksi_tambak`
--
ALTER TABLE `tbl_produksi_tambak`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tbl_wil_kerja`
--
ALTER TABLE `tbl_wil_kerja`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
