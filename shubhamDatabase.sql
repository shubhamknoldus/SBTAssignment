-- MySQL dump 10.13  Distrib 5.7.20, for Linux (x86_64)
--
-- Host: localhost    Database: calculator
-- ------------------------------------------------------
-- Server version	5.7.20-0ubuntu0.16.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `calculator`
--

DROP TABLE IF EXISTS `calculator`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `calculator` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `timestamp` datetime DEFAULT CURRENT_TIMESTAMP,
  `left_operand` float DEFAULT NULL,
  `right_operand` float DEFAULT NULL,
  `operator` varchar(20) DEFAULT NULL,
  `result` float DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `calculator`
--

LOCK TABLES `calculator` WRITE;
/*!40000 ALTER TABLE `calculator` DISABLE KEYS */;
INSERT INTO `calculator` VALUES (2,'2018-01-07 13:56:37',12,56,'Subtract',-44),(3,'2018-01-07 13:56:47',34,76,'Subtract',-42),(4,'2018-01-07 13:57:00',2,6,'power',64),(5,'2018-01-07 20:41:16',34,-90,'Add',-56),(6,'2018-01-07 20:41:26',34,76,'Add',110),(7,'2018-01-07 20:41:41',2.345,4.35,'Subtract',-2.005),(8,'2018-01-07 20:43:05',34,-17,'Divide',-2),(9,'2018-01-07 20:43:20',234,-456,'Multiplication',-106704),(10,'2018-01-07 20:43:36',694.484,0,'absolute value',694.484),(11,'2018-01-07 20:44:16',23,90,'Max Value',90),(12,'2018-01-07 20:44:33',2.34,2.35,'Max Value',2.35),(13,'2018-01-07 20:45:04',56,-76,'Max Value',56),(14,'2018-01-07 20:45:14',56,54,'min Value',56),(15,'2018-01-07 20:45:26',45,12,'min Value',45),(16,'2018-01-07 20:45:41',45,9,'modulus',0),(17,'2018-01-07 20:45:59',45,4,'modulus',1);
/*!40000 ALTER TABLE `calculator` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-01-07 20:57:31
