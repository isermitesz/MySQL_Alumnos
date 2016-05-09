CREATE TABLE `alumnos` (
  `noControl` varchar(8) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellidoP` varchar(15) NOT NULL,
  `apellidoM` varchar(15) NOT NULL,
  `semestre` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `carreras` (
  `cveCarrera` int(11) NOT NULL,
  `nomCarrera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `materias` (
  `cveMateria` varchar(10) NOT NULL,
  `nomMateria` varchar(50) NOT NULL,
  `creditos` int(11) NOT NULL,
  `cveCarrera` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `usuarios` (
  `cveUsuario` int(11) NOT NULL,
  `nombreUs` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `cveTipo` int(11) NOT NULL
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

