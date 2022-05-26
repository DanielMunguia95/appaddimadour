/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele.DB;
import Modele.DB.Connexion;
import Modele.LmdCabecer;
import java.sql.Connection;
import java.util.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/**
 *
 * @author admon
 */
public class QueryLmd extends Connexion {
   public boolean saveLmd(LmdCabecer lmd) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        boolean existNameLmd = false;

        try {
            existNameLmd = this.validateNumFiche(lmd.getNumeroFiche() == null ? "" : lmd.getNumeroFiche());

            if (existNameLmd != true) {
                String sql = "INSERT INTO lmd(date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso, metas, opeVerificacion, llenGas, operador, "
                        + "material, boquillaUtilizada, tamSustrato, tamHabitacion, croquis, centroLaser, salidaPolvoCabeza, boquillaPza1, boquillaPza2, boquillaPza3, boquillaPza4,"
                        + " boquillaPza5, boquillaPza6, boquillaPza7, boquillaPza8, boquillaPza9, boquillaPza10, boquillaPzaTotal, velocidadMaquina1, velocidadMaquina2, "
                        + "velocidadMaquina3, velocidadMaquina4, velocidadMaquina5, velocidadMaquina6, velocidadMaquina7, velocidadMaquina8, velocidadMaquina9, velocidadMaquina10, "
                        + "velocidadMaquinaTotal, higometria1, higometria2, higometria3, higometria4, higometria5, higometria6, higometria7, higometria8, higometria9, higometria10, "
                        + "higometriaTotal, temperatura1, temperatura2, temperatura3, temperatura4, temperatura5, temperatura6, temperatura7, temperatura8, temperatura9, temperatura10, "
                        + "temperaturaTotal, temporizador1, temporizador2, temporizador3, temporizador4, temporizador5, temporizador6, temporizador7, temporizador8, temporizador9, "
                        + "temporizador10, temporizadorTotal, salidaPolvo1, salidaPolvo2, salidaPolvo3, salidaPolvo4, salidaPolvo5, salidaPolvo6, salidaPolvo7, salidaPolvo8, "
                        + "salidaPolvo9, salidaPolvo10, salidaPolvoTotal, d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, dTotal, ganulometria1, ganulometria2, ganulometria3, ganulometria4, "
                        + "ganulometria5, ganulometria6, ganulometria7, ganulometria8, ganulometria9, ganulometria10, ganulometriaTotal, potenciaLaser1, potenciaLaser2, potenciaLaser3, "
                        + "potenciaLaser4, potenciaLaser5, potenciaLaser6, potenciaLaser7, potenciaLaser8, potenciaLaser9, potenciaLaser10, potenciaLaserTotal, modoLaser1, modoLaser2, "
                        + "modoLaser3, modoLaser4, modoLaser5, modoLaser6, modoLaser7, modoLaser8, modoLaser9, modoLaser10, modoLaserTotal, y1, y2, y3, y4, y5, y6, y7, y8, y9, y10, "
                        + "yTotal, z1, z2, z3, z4, z5, z6, z7, z8, z9, z10, zTotal, h311, h312, h313, h314, h315, h316, h317, h318, h319, h3110, h31Total, h611, h612, h613, h614, h615,"
                        + " h616, h617, h618, h619, h6110, h61Total, velocidadMezclador1, velocidadMezclador2, velocidadMezclador3, velocidadMezclador4, velocidadMezclador5, "
                        + "velocidadMezclador6, velocidadMezclador7, velocidadMezclador8, velocidadMezclador9, velocidadMezclador10, velocidadMezcladorTotal, vitTir1, vitTir2, "
                        + "vitTir3, vitTir4, vitTir5, vitTir6, vitTir7, vitTir8, vitTir9, vitTir10, vitTirTotal, referencias1, referencias2, referencias3, referencias4, referencias5, "
                        + "referencias6, referencias7, referencias8, referencias9, referencias10, referenciasTotal, comentarios, o2, h20, tratamientoTermico, mecanizado, resultados) "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

                ps = con.prepareStatement(sql);

                ps.setString(1, lmd.getDate()== null ? "" : lmd.getDate());
                ps.setString(2, lmd.getHeure()== null ? "" : lmd.getHeure());
                ps.setString(3, lmd.getMachine()== null ? "" : lmd.getMachine());
                ps.setString(4, lmd.getHeure()== null ? "" : lmd.getHeure());
                ps.setString(5, lmd.getNumeroFiche()== null ? "" : lmd.getNumeroFiche());
                ps.setString(6, lmd.getNumeroCaso()== null ? "" : lmd.getNumeroCaso());
                ps.setString(7, lmd.getNumeroPlaca()== null ? "" : lmd.getNumeroPlaca());
                ps.setString(8, lmd.getRefMateriales()== null ? "" : lmd.getRefMateriales());
                ps.setString(9, lmd.getPreProceso()== null ? "" : lmd.getPreProceso());
                ps.setString(10, lmd.getMetas()== null ? "" : lmd.getMetas());
                ps.setString(11, lmd.getOpeVerificacion()== null ? "" : lmd.getOpeVerificacion());
                ps.setString(12, lmd.getLlenGas()== null ? "" : lmd.getLlenGas());
                ps.setString(13, lmd.getOperador()== null ? "" : lmd.getOperador());
                ps.setString(14, lmd.getMaterial()== null ? "" : lmd.getMaterial());
                ps.setString(15, lmd.getBoquillaUtilizada()== null ? "" : lmd.getBoquillaUtilizada());
                ps.setString(16, lmd.getTamSustrato()== null ? "" : lmd.getTamSustrato());
                ps.setString(17, lmd.getTamHabitacion()== null ? "" : lmd.getTamHabitacion());
                ps.setString(18, lmd.getCroquis()== null ? "" : lmd.getCroquis());
                ps.setString(19, lmd.getCentroLaser()== null ? "" : lmd.getCentroLaser());
                ps.setString(20, lmd.getSalidaPolvoCabeza()== null ? "" : lmd.getSalidaPolvoCabeza());
                ps.setString(21, lmd.getPreProceso()== null ? "" : lmd.getPreProceso());
                
                //Parametros
                ps.setString(22, lmd.getBoquillaPza1()== null ? "" : lmd.getBoquillaPza1());
                ps.setString(23, lmd.getBoquillaPza2()== null ? "" : lmd.getBoquillaPza2());
                ps.setString(24, lmd.getBoquillaPza3()== null ? "" : lmd.getBoquillaPza3());
                ps.setString(25, lmd.getBoquillaPza4()== null ? "" : lmd.getBoquillaPza4());
                ps.setString(26, lmd.getBoquillaPza5()== null ? "" : lmd.getBoquillaPza5());
                ps.setString(27, lmd.getBoquillaPza6()== null ? "" : lmd.getBoquillaPza6());
                ps.setString(28, lmd.getBoquillaPza7()== null ? "" : lmd.getBoquillaPza7());
                ps.setString(29, lmd.getBoquillaPza8()== null ? "" : lmd.getBoquillaPza8());
                ps.setString(30, lmd.getBoquillaPza9()== null ? "" : lmd.getBoquillaPza9());
                ps.setString(31, lmd.getBoquillaPza10()== null ? "" : lmd.getBoquillaPza10());
                ps.setString(32, lmd.getBoquillaPzaTotal()== null ? "" : lmd.getBoquillaPzaTotal());
                
                ps.setString(33, lmd.getVelocidadMaquina1()== null ? "" : lmd.getVelocidadMaquina1());
                ps.setString(34, lmd.getVelocidadMaquina2()== null ? "" : lmd.getVelocidadMaquina2());
                ps.setString(35, lmd.getVelocidadMaquina3()== null ? "" : lmd.getVelocidadMaquina3());
                ps.setString(36, lmd.getVelocidadMaquina4()== null ? "" : lmd.getVelocidadMaquina4());
                ps.setString(37, lmd.getVelocidadMaquina5()== null ? "" : lmd.getVelocidadMaquina5());
                ps.setString(38, lmd.getVelocidadMaquina6()== null ? "" : lmd.getVelocidadMaquina6());
                ps.setString(39, lmd.getVelocidadMaquina7()== null ? "" : lmd.getVelocidadMaquina7());
                ps.setString(40, lmd.getVelocidadMaquina8()== null ? "" : lmd.getVelocidadMaquina8());
                ps.setString(41, lmd.getVelocidadMaquina9()== null ? "" : lmd.getVelocidadMaquina9());
                ps.setString(42, lmd.getVelocidadMaquina10()== null ? "" : lmd.getVelocidadMaquina10());
                ps.setString(43, lmd.getVelocidadMaquinaTotal()== null ? "" : lmd.getVelocidadMaquinaTotal());
                
                ps.setString(44, lmd.getHigometria1()== null ? "" : lmd.getHigometria1());
                ps.setString(45, lmd.getHigometria2()== null ? "" : lmd.getHigometria2());
                ps.setString(46, lmd.getHigometria3()== null ? "" : lmd.getHigometria3());
                ps.setString(47, lmd.getHigometria4()== null ? "" : lmd.getHigometria4());
                ps.setString(48, lmd.getHigometria5()== null ? "" : lmd.getHigometria5());
                ps.setString(49, lmd.getHigometria6()== null ? "" : lmd.getHigometria6());
                ps.setString(50, lmd.getHigometria7()== null ? "" : lmd.getHigometria7());
                ps.setString(51, lmd.getHigometria8()== null ? "" : lmd.getHigometria8());
                ps.setString(52, lmd.getHigometria9()== null ? "" : lmd.getHigometria9());
                ps.setString(53, lmd.getHigometria10()== null ? "" : lmd.getHigometria10());
                ps.setString(54, lmd.getHigometriaTotal()== null ? "" : lmd.getHigometriaTotal());
                
                ps.setString(55, lmd.getTemperatura1()== null ? "" : lmd.getTemperatura1());
                ps.setString(56, lmd.getTemperatura2()== null ? "" : lmd.getTemperatura2());
                ps.setString(57, lmd.getTemperatura3()== null ? "" : lmd.getTemperatura3());
                ps.setString(58, lmd.getTemperatura4()== null ? "" : lmd.getTemperatura4());
                ps.setString(59, lmd.getTemperatura5()== null ? "" : lmd.getTemperatura5());
                ps.setString(60, lmd.getTemperatura6()== null ? "" : lmd.getTemperatura6());
                ps.setString(61, lmd.getTemperatura7()== null ? "" : lmd.getTemperatura7());
                ps.setString(62, lmd.getTemperatura8()== null ? "" : lmd.getTemperatura8());
                ps.setString(63, lmd.getTemperatura9()== null ? "" : lmd.getTemperatura9());
                ps.setString(64, lmd.getTemperatura10()== null ? "" : lmd.getTemperatura10());
                ps.setString(65, lmd.getTemperaturaTotal()== null ? "" : lmd.getTemperaturaTotal());
                
                ps.setString(66, lmd.getTemporizador1()== null ? "" : lmd.getTemporizador1());
                ps.setString(67, lmd.getTemporizador2()== null ? "" : lmd.getTemporizador2());
                ps.setString(68, lmd.getTemporizador3()== null ? "" : lmd.getTemporizador3());
                ps.setString(69, lmd.getTemporizador4()== null ? "" : lmd.getTemporizador4());
                ps.setString(70, lmd.getTemporizador5()== null ? "" : lmd.getTemporizador5());
                ps.setString(71, lmd.getTemporizador6()== null ? "" : lmd.getTemporizador6());
                ps.setString(72, lmd.getTemporizador7()== null ? "" : lmd.getTemporizador7());
                ps.setString(73, lmd.getTemporizador8()== null ? "" : lmd.getTemporizador8());
                ps.setString(74, lmd.getTemporizador9()== null ? "" : lmd.getTemporizador9());
                ps.setString(75, lmd.getTemporizador10()== null ? "" : lmd.getTemporizador10());
                ps.setString(76, lmd.getTemporizadorTotal()== null ? "" : lmd.getTemporizadorTotal());
               
                ps.setString(77, lmd.getSalidaPolvo1()== null ? "" : lmd.getSalidaPolvo1());
                ps.setString(78, lmd.getSalidaPolvo2()== null ? "" : lmd.getSalidaPolvo2());
                ps.setString(79, lmd.getSalidaPolvo3()== null ? "" : lmd.getSalidaPolvo3());
                ps.setString(80, lmd.getSalidaPolvo4()== null ? "" : lmd.getSalidaPolvo4());
                ps.setString(81, lmd.getSalidaPolvo5()== null ? "" : lmd.getSalidaPolvo5());
                ps.setString(82, lmd.getSalidaPolvo6()== null ? "" : lmd.getSalidaPolvo6());
                ps.setString(83, lmd.getSalidaPolvo7()== null ? "" : lmd.getSalidaPolvo7());
                ps.setString(84, lmd.getSalidaPolvo8()== null ? "" : lmd.getSalidaPolvo8());
                ps.setString(85, lmd.getSalidaPolvo9()== null ? "" : lmd.getSalidaPolvo9());
                ps.setString(86, lmd.getSalidaPolvo10()== null ? "" : lmd.getSalidaPolvo10());
                ps.setString(87, lmd.getSalidaPolvoTotal()== null ? "" : lmd.getSalidaPolvoTotal());
                
                ps.setString(88, lmd.getSalidaPolvo1()== null ? "" : lmd.getSalidaPolvo1());
                ps.setString(89, lmd.getSalidaPolvo2()== null ? "" : lmd.getSalidaPolvo2());
                ps.setString(90, lmd.getSalidaPolvo3()== null ? "" : lmd.getSalidaPolvo3());
                ps.setString(91, lmd.getSalidaPolvo4()== null ? "" : lmd.getSalidaPolvo4());
                ps.setString(92, lmd.getSalidaPolvo5()== null ? "" : lmd.getSalidaPolvo5());
                ps.setString(93, lmd.getSalidaPolvo6()== null ? "" : lmd.getSalidaPolvo6());
                ps.setString(94, lmd.getSalidaPolvo7()== null ? "" : lmd.getSalidaPolvo7());
                ps.setString(95, lmd.getSalidaPolvo8()== null ? "" : lmd.getSalidaPolvo8());
                ps.setString(96, lmd.getSalidaPolvo9()== null ? "" : lmd.getSalidaPolvo9());
                ps.setString(97, lmd.getSalidaPolvo10()== null ? "" : lmd.getSalidaPolvo10());
                ps.setString(98, lmd.getSalidaPolvoTotal()== null ? "" : lmd.getSalidaPolvoTotal());
                
                ps.setString(99, lmd.getD1()== null ? "" : lmd.getD1());
                ps.setString(99, lmd.getD2()== null ? "" : lmd.getD2());
                ps.setString(100, lmd.getD3()== null ? "" : lmd.getD3());
                ps.setString(101, lmd.getD4()== null ? "" : lmd.getD4());
                ps.setString(102, lmd.getD5()== null ? "" : lmd.getD5());
                ps.setString(103, lmd.getD6()== null ? "" : lmd.getD6());
                ps.setString(104, lmd.getD7()== null ? "" : lmd.getD7());
                ps.setString(105, lmd.getD8()== null ? "" : lmd.getD8());
                ps.setString(106, lmd.getD9()== null ? "" : lmd.getD9());
                ps.setString(107, lmd.getD10()== null ? "" : lmd.getD10());
                ps.setString(108, lmd.getdTotal()== null ? "" : lmd.getdTotal());
                
                ps.setString(109, lmd.getPotenciaLaser1()== null ? "" : lmd.getPotenciaLaser1());
                ps.setString(110, lmd.getPotenciaLaser2()== null ? "" : lmd.getPotenciaLaser2());
                ps.setString(111, lmd.getPotenciaLaser3()== null ? "" : lmd.getPotenciaLaser3());
                ps.setString(112, lmd.getPotenciaLaser4()== null ? "" : lmd.getPotenciaLaser4());
                ps.setString(113, lmd.getPotenciaLaser5()== null ? "" : lmd.getPotenciaLaser5());
                ps.setString(114, lmd.getPotenciaLaser6()== null ? "" : lmd.getPotenciaLaser6());
                ps.setString(115, lmd.getPotenciaLaser7()== null ? "" : lmd.getPotenciaLaser7());
                ps.setString(116, lmd.getPotenciaLaser8()== null ? "" : lmd.getPotenciaLaser8());
                ps.setString(117, lmd.getPotenciaLaser9()== null ? "" : lmd.getPotenciaLaser9());
                ps.setString(118, lmd.getPotenciaLaser10()== null ? "" : lmd.getPotenciaLaser10());
                ps.setString(119, lmd.getPotenciaLaserTotal()== null ? "" : lmd.getPotenciaLaserTotal());
                
                ps.setString(120, lmd.getModoLaser1()== null ? "" : lmd.getPotenciaLaser1());
                ps.setString(121, lmd.getModoLaser2()== null ? "" : lmd.getPotenciaLaser2());
                ps.setString(122, lmd.getModoLaser3()== null ? "" : lmd.getPotenciaLaser3());
                ps.setString(123, lmd.getModoLaser4()== null ? "" : lmd.getPotenciaLaser4());
                ps.setString(124, lmd.getModoLaser5()== null ? "" : lmd.getPotenciaLaser5());
                ps.setString(125, lmd.getModoLaser6()== null ? "" : lmd.getPotenciaLaser6());
                ps.setString(126, lmd.getModoLaser7()== null ? "" : lmd.getPotenciaLaser7());
                ps.setString(127, lmd.getModoLaser8()== null ? "" : lmd.getPotenciaLaser8());
                ps.setString(128, lmd.getModoLaser9()== null ? "" : lmd.getPotenciaLaser9());
                ps.setString(129, lmd.getModoLaser10()== null ? "" : lmd.getPotenciaLaser10());
                ps.setString(130, lmd.getModoLaserTotal()== null ? "" : lmd.getPotenciaLaserTotal());

                ps.setString(131, lmd.getY1()== null ? "" : lmd.getY1());
                ps.setString(132, lmd.getY2()== null ? "" : lmd.getY2());
                ps.setString(133, lmd.getY3()== null ? "" : lmd.getY3());
                ps.setString(134, lmd.getY4()== null ? "" : lmd.getY4());
                ps.setString(135, lmd.getY5()== null ? "" : lmd.getY5());
                ps.setString(136, lmd.getY6()== null ? "" : lmd.getY6());
                ps.setString(137, lmd.getY7()== null ? "" : lmd.getY7());
                ps.setString(138, lmd.getY8()== null ? "" : lmd.getY8());
                ps.setString(139, lmd.getY9()== null ? "" : lmd.getY9());
                ps.setString(140, lmd.getY10()== null ? "" : lmd.getY10());
                ps.setString(141, lmd.getyTotal()== null ? "" : lmd.getyTotal());
                
                ps.setString(142, lmd.getZ1()== null ? "" : lmd.getZ1());
                ps.setString(143, lmd.getZ2()== null ? "" : lmd.getZ2());
                ps.setString(144, lmd.getZ3()== null ? "" : lmd.getZ3());
                ps.setString(145, lmd.getZ4()== null ? "" : lmd.getZ4());
                ps.setString(146, lmd.getZ5()== null ? "" : lmd.getZ5());
                ps.setString(147, lmd.getZ6()== null ? "" : lmd.getZ6());
                ps.setString(148, lmd.getZ7()== null ? "" : lmd.getZ7());
                ps.setString(149, lmd.getZ8()== null ? "" : lmd.getZ8());
                ps.setString(150, lmd.getZ9()== null ? "" : lmd.getZ9());
                ps.setString(151, lmd.getZ10()== null ? "" : lmd.getZ10());
                ps.setString(152, lmd.getzTotal()== null ? "" : lmd.getzTotal());
                
                ps.setString(153, lmd.getH311()== null ? "" : lmd.getH311());
                ps.setString(154, lmd.getH312()== null ? "" : lmd.getH312());
                ps.setString(155, lmd.getH313()== null ? "" : lmd.getH313());
                ps.setString(156, lmd.getH314()== null ? "" : lmd.getH314());
                ps.setString(157, lmd.getH315()== null ? "" : lmd.getH315());
                ps.setString(158, lmd.getH316()== null ? "" : lmd.getH316());
                ps.setString(159, lmd.getH317()== null ? "" : lmd.getH317());
                ps.setString(160, lmd.getH318()== null ? "" : lmd.getH318());
                ps.setString(161, lmd.getH319()== null ? "" : lmd.getH319());
                ps.setString(162, lmd.getH3110()== null ? "" : lmd.getH3110());
                ps.setString(163, lmd.getH31Total()== null ? "" : lmd.getH31Total());
                
                ps.setString(164, lmd.getH611()== null ? "" : lmd.getH611());
                ps.setString(165, lmd.getH612()== null ? "" : lmd.getH612());
                ps.setString(166, lmd.getH613()== null ? "" : lmd.getH613());
                ps.setString(167, lmd.getH614()== null ? "" : lmd.getH614());
                ps.setString(168, lmd.getH615()== null ? "" : lmd.getH615());
                ps.setString(169, lmd.getH616()== null ? "" : lmd.getH616());
                ps.setString(170, lmd.getH617()== null ? "" : lmd.getH617());
                ps.setString(171, lmd.getH618()== null ? "" : lmd.getH618());
                ps.setString(172, lmd.getH619()== null ? "" : lmd.getH619());
                ps.setString(173, lmd.getH6110()== null ? "" : lmd.getH6110());
                ps.setString(174, lmd.getH61Total()== null ? "" : lmd.getH61Total());
                
                ps.setString(175, lmd.getVelocidadMezclador1()== null ? "" : lmd.getVelocidadMezclador1());
                ps.setString(176, lmd.getVelocidadMezclador2()== null ? "" : lmd.getVelocidadMezclador2());
                ps.setString(177, lmd.getVelocidadMezclador3()== null ? "" : lmd.getVelocidadMezclador3());
                ps.setString(178, lmd.getVelocidadMezclador4()== null ? "" : lmd.getVelocidadMezclador4());
                ps.setString(179, lmd.getVelocidadMezclador5()== null ? "" : lmd.getVelocidadMezclador5());
                ps.setString(180, lmd.getVelocidadMezclador6()== null ? "" : lmd.getVelocidadMezclador6());
                ps.setString(181, lmd.getVelocidadMezclador7()== null ? "" : lmd.getVelocidadMezclador7());
                ps.setString(182, lmd.getVelocidadMezclador8()== null ? "" : lmd.getVelocidadMezclador8());
                ps.setString(183, lmd.getVelocidadMezclador9()== null ? "" : lmd.getVelocidadMezclador9());
                ps.setString(184, lmd.getVelocidadMezclador10()== null ? "" : lmd.getVelocidadMezclador10());
                ps.setString(185, lmd.getVelocidadMezcladorTotal()== null ? "" : lmd.getVelocidadMezcladorTotal());
                
                ps.setString(186, lmd.getVitTir1()== null ? "" : lmd.getVitTir1());
                ps.setString(187, lmd.getVitTir2()== null ? "" : lmd.getVitTir2());
                ps.setString(188, lmd.getVitTir3()== null ? "" : lmd.getVitTir3());
                ps.setString(189, lmd.getVitTir4()== null ? "" : lmd.getVitTir4());
                ps.setString(190, lmd.getVitTir5()== null ? "" : lmd.getVitTir5());
                ps.setString(191, lmd.getVitTir6()== null ? "" : lmd.getVitTir6());
                ps.setString(192, lmd.getVitTir7()== null ? "" : lmd.getVitTir7());
                ps.setString(193, lmd.getVitTir8()== null ? "" : lmd.getVitTir8());
                ps.setString(194, lmd.getVitTir9()== null ? "" : lmd.getVitTir9());
                ps.setString(195, lmd.getVitTir10()== null ? "" : lmd.getVitTir10());
                ps.setString(196, lmd.getVitTirTotal()== null ? "" : lmd.getVitTirTotal());
                
                ps.setString(197, lmd.getReferencias1()== null ? "" : lmd.getReferencias1());
                ps.setString(198, lmd.getReferencias2()== null ? "" : lmd.getReferencias2());
                ps.setString(199, lmd.getReferencias3()== null ? "" : lmd.getReferencias3());
                ps.setString(200, lmd.getReferencias4()== null ? "" : lmd.getReferencias4());
                ps.setString(201, lmd.getReferencias5()== null ? "" : lmd.getReferencias5());
                ps.setString(202, lmd.getReferencias6()== null ? "" : lmd.getReferencias6());
                ps.setString(203, lmd.getReferencias7()== null ? "" : lmd.getReferencias7());
                ps.setString(204, lmd.getReferencias8()== null ? "" : lmd.getReferencias8());
                ps.setString(205, lmd.getReferencias9()== null ? "" : lmd.getReferencias9());
                ps.setString(206, lmd.getReferencias10()== null ? "" : lmd.getReferencias10());
                ps.setString(207, lmd.getReferenciasTotal()== null ? "" : lmd.getReferenciasTotal());
                
                ps.setString(208, lmd.getComentarios()== null ? "" : lmd.getComentarios());
                ps.setString(209, lmd.getO2()== null ? "" : lmd.getO2());
                ps.setString(210, lmd.getH20()== null ? "" : lmd.getH20());
                
                //PIE
                ps.setString(211, lmd.getTratamientoTermico()== null ? "" : lmd.getTratamientoTermico());
                ps.setString(212, lmd.getMecanizado()== null ? "" : lmd.getMecanizado());
                //ps.setString(214, lmd.getResultados()== null ? "" : lmd.getResultados());

                
                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Insert Success");
                    return rs=true;
                } else {
                    System.out.println("Insert Fail");
                    return rs=false;
                }
            } else {
                System.out.println("ya existe un registro con ese num fiche");
            }

        } catch (SQLException e) {
            rs = false;
            System.out.println(e);

        } finally {
            try {

                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return rs;
    } 
   
   public boolean validateNumFiche(String nameLmd) {

        boolean validate = false;
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select nameLabo FROM appaddimadour.lmd where nameLabo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, nameLmd);

            rs = ps.executeQuery();

            if (rs.next()) {
                validate = true;
            } else {
                validate = false;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return validate;
    }

   public List<String> getAllLmd() {

        List<String> Lmd = new ArrayList<>();

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "Select numeroFiche from appaddimadour.lmd";

        try {
            ps = con.prepareStatement(sql);

            rs = ps.executeQuery();

            while (rs.next()) {
                if (rs.getRow() != 0) {

                    Lmd.add(rs.getString("numeroFiche"));

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Lmd;
    }
   
   public int getLmdId(String numeroFiche) {

        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "select idLmd from appaddimadour.lmd where numeroFiche=?";
        int id = 0;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, numeroFiche);
            rs = ps.executeQuery();

            if (rs.next()) {
                id = rs.getInt("idLmd");
            }

        } catch (Exception e) {

            return 0;
        }

        return id;

    }
   
   public LmdCabecer getLmd(String idLmd) {
        LmdCabecer lmd = new LmdCabecer();
        Connection con = getConexion();
        ResultSet rs = null;
        PreparedStatement ps = null;
        String sql = "SELECT date, heure, machine, numeroFiche, numeroCaso, numeroPlaca, refMateriales, preProceso, metas, opeVerificacion, llenGas, operador, material, boquillaUtilizada, tamSustrato, tamHabitacion, croquis, centroLaser, salidaPolvoCabeza "
                + "FROM lmd WHERE idLmd = ?";
                        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, idLmd);

            rs = ps.executeQuery();

            if (rs.next()) {
                lmd.setDate(rs.getString("date"));
                lmd.setHeure(rs.getString("heure"));
                lmd.setMachine(rs.getString("machine"));
                lmd.setNumeroFiche(rs.getString("numeroFiche"));
                lmd.setNumeroCaso(rs.getString("numeroCaso"));
                lmd.setNumeroPlaca(rs.getString("numeroPlaca"));
                lmd.setRefMateriales(rs.getString("refMateriales"));
                lmd.setPreProceso(rs.getString("preProceso"));
                lmd.setMetas(rs.getString("metas"));
                lmd.setOpeVerificacion(rs.getString("opeVerificacion"));
                lmd.setLlenGas(rs.getString("llenGas"));
                lmd.setOperador(rs.getString("operador"));
                lmd.setMaterial(rs.getString("material"));
                lmd.setBoquillaUtilizada(rs.getString("boquillaUtilizada"));
                lmd.setTamSustrato(rs.getString("tamSustrato"));
                lmd.setTamHabitacion(rs.getString("tamHabitacion"));
                lmd.setCroquis(rs.getString("croquis"));
                lmd.setCentroLaser(rs.getString("centroLaser"));
                lmd.setSalidaPolvoCabeza(rs.getString("salidaPolvoCabeza"));
            }

        } catch (Exception e) {
            lmd=null;
            e.printStackTrace();
        }
        return lmd;
    }
   
   public boolean updateLmd(LmdCabecer Lmd) {

        Connection con = getConexion();
        boolean rs = false;
        PreparedStatement ps = null;
        int idLmd = 0;
        try {

            //if (this.validateNumFiche(Waam.getNumeroFiche()== null ? "" : Waam.getNumeroFiche()) != true) {
                idLmd = this.getLmdId(Lmd.getNumeroFiche()== null ? "" : Lmd.getNumeroFiche());
                //idLabo = this.getLaboId(labos.getNomLLabo() == null ? "" : labos.getNomLLabo());
                String sql = "UPDATE lmd SET date=?,heure=?,machine=?,numeroFiche=?,numeroCaso=?,numeroPlaca=?,refMateriales=?,preProceso=?,metas=?,opeVerificacion=?,llenGas=?,operador=?,material=?,boquillaUtilizada=?,tamSustrato=?,tamHabitacion=?,croquis=?,centroLaser=?,salidaPolvoCabeza=?"
                        + " WHERE idLmd = ?";


                ps = con.prepareStatement(sql);

                ps.setString(1, Lmd.getDate());
                ps.setString(2, Lmd.getHeure());
                ps.setString(3, Lmd.getMachine());
                ps.setString(4, Lmd.getNumeroFiche());
                ps.setString(5, Lmd.getNumeroCaso());
                ps.setString(6, Lmd.getNumeroPlaca());
                ps.setString(7, Lmd.getRefMateriales());
                ps.setString(8, Lmd.getPreProceso());
                ps.setString(9, Lmd.getMetas());
                ps.setString(10, Lmd.getOpeVerificacion());
                ps.setString(11, Lmd.getLlenGas());
                ps.setString(12, Lmd.getOperador());
                ps.setString(13, Lmd.getMaterial());
                ps.setString(14, Lmd.getBoquillaUtilizada());
                ps.setString(15, Lmd.getTamSustrato());
                ps.setString(16, Lmd.getTamHabitacion());
                ps.setString(17, Lmd.getCroquis());
                ps.setString(18, Lmd.getCentroLaser());
                ps.setString(19, Lmd.getSalidaPolvoCabeza());
                ps.setInt(20, idLmd);

                int iInsCnt = ps.executeUpdate();
                if (iInsCnt > 0) {
                    System.out.println("Update Success");
                    return true;
                } else {
                    System.out.println("Update Fail");
                    return false;
                }
//            }else{
//                System.out.println("ya existe un registro con ese num fiche update");
//            }

        } catch (SQLException e) {
            rs = false;
            System.out.println(e);

        } finally {
            try {

                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
        }
        return false;
    }
    
   public boolean deleteLmd(String nameLmd) {

        Connection con = getConexion();
        boolean delete=false;
        int rs = 0;
        int idLmd=0;
        PreparedStatement ps = null;
        String sql = "delete from appaddimadour.lmd where idLmd=?";
        int id = 0;
        try {
            idLmd=this.getLmdId(nameLmd);
            ps = con.prepareStatement(sql);
            ps.setInt(1, idLmd);
            rs = ps.executeUpdate();

            if (rs>0) {
                delete=true;
            }else{
                delete=false;
                System.out.println("No se elimino");
            }

        } catch (Exception e) {

            return delete;
        }

        return delete;

    }
}
