-- phpMyAdmin SQL Dump
-- version 4.4.13.1deb1
-- http://www.phpmyadmin.net
--
-- Servidor: localhost
-- Tiempo de generación: 24-05-2016 a las 16:33:44
-- Versión del servidor: 5.6.30-0ubuntu0.15.10.1
-- Versión de PHP: 5.6.11-1ubuntu3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `hotel`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acceso`
--

CREATE TABLE IF NOT EXISTS `acceso` (
  `usuario` varchar(255) COLLATE utf8_unicode_ci NOT NULL,
  `clave` varchar(255) COLLATE utf8_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;

--
-- Volcado de datos para la tabla `acceso`
--

INSERT INTO `acceso` (`usuario`, `clave`) VALUES
('admin', '123456'),
('tux', 'linux'),
('usuario', 'usuario'),
('root', 'toor'),
('caja', 'loca'),
('peca', 'rara'),
('poco', 'dinero'),
('rata', 'negra'),
('null', 'null'),
('gato', 'blanco'),
('manzana', 'verde');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Monstruo`
--

CREATE TABLE IF NOT EXISTS `Monstruo` (
  `MonstruoID` int(11) NOT NULL,
  `Nombre` varchar(40) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Edad` int(11) DEFAULT NULL,
  `Tipo` varchar(30) COLLATE utf8_spanish_ci DEFAULT NULL,
  `Habitacion` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

--
-- Volcado de datos para la tabla `Monstruo`
--

INSERT INTO `Monstruo` (`MonstruoID`, `Nombre`, `Edad`, `Tipo`, `Habitacion`) VALUES
(1501, 'Cleo', 120, 'MomiaMujer', 152),
(1502, 'Gulia', 69, 'Zombie', 358),
(1505, 'Draculaura', 96, 'Vampiro', 418),
(1506, 'Gulia', 956, 'Zombie', 985),
(1508, 'Casper', 159, 'fantasma', 859),
(1510, 'Tutancamon', 7895, 'MomiaHombre', 654);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Monstruo`
--
ALTER TABLE `Monstruo`
  ADD PRIMARY KEY (`MonstruoID`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
