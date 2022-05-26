/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Modele;

/**
 *
 * @author admon
 */
public class LmdCabecer {
    //encabezado
    private int idDepot;
    private String date;
    private String heure;
    private String machine;
    private String numeroFiche;
    private String numeroCaso;
    private String numeroPlaca;
    private String refMateriales;
    private String preProceso;
    private String metas;//BIEN
    private String opeVerificacion;
    private String llenGas;
    private String operador;
    private String material;
    private String boquillaUtilizada;
    private String tamSustrato;
    private String tamHabitacion;
    private String croquis;
    private String centroLaser;
    private String salidaPolvoCabeza;
    //parametros
    private String boquillaPza1;
    private String boquillaPza2;
    private String boquillaPza3;
    private String boquillaPza4;
    private String boquillaPza5;
    private String boquillaPza6;
    private String boquillaPza7;
    private String boquillaPza8;
    private String boquillaPza9;
    private String boquillaPza10;
    private String boquillaPzaTotal;
    
    private String velocidadMaquina1;
    private String velocidadMaquina2;
    private String velocidadMaquina3;
    private String velocidadMaquina4;
    private String velocidadMaquina5;
    private String velocidadMaquina6;
    private String velocidadMaquina7;
    private String velocidadMaquina8;
    private String velocidadMaquina9;
    private String velocidadMaquina10;
    private String velocidadMaquinaTotal;
    
    private String higometria1;
    private String higometria2;
    private String higometria3;
    private String higometria4;
    private String higometria5;
    private String higometria6;
    private String higometria7;
    private String higometria8;
    private String higometria9;
    private String higometria10;
    private String higometriaTotal;
    
    private String temperatura1;
    private String temperatura2;
    private String temperatura3;
    private String temperatura4;
    private String temperatura5;
    private String temperatura6;
    private String temperatura7;
    private String temperatura8;
    private String temperatura9;
    private String temperatura10;
    private String temperaturaTotal;
    
    private String temporizador1;
    private String temporizador2;
    private String temporizador3;
    private String temporizador4;
    private String temporizador5;
    private String temporizador6;
    private String temporizador7;
    private String temporizador8;
    private String temporizador9;
    private String temporizador10;
    private String temporizadorTotal;
    
    private String salidaPolvo1;
    private String salidaPolvo2;
    private String salidaPolvo3;
    private String salidaPolvo4;
    private String salidaPolvo5;
    private String salidaPolvo6;
    private String salidaPolvo7;
    private String salidaPolvo8;
    private String salidaPolvo9;
    private String salidaPolvo10;
    private String salidaPolvoTotal;
    
    
    private String d1;
    private String d2;
    private String d3;
    private String d4;
    private String d5;
    private String d6;
    private String d7;
    private String d8;
    private String d9;
    private String d10;
    private String dTotal;
    
    private String ganulometria1;
    private String ganulometria2;
    private String ganulometria3;
    private String ganulometria4;
    private String ganulometria5;
    private String ganulometria6;
    private String ganulometria7;
    private String ganulometria8;
    private String ganulometria9;
    private String ganulometria10;
    private String ganulometriaTotal;
    
    private String potenciaLaser1;
    private String potenciaLaser2;
    private String potenciaLaser3;
    private String potenciaLaser4;
    private String potenciaLaser5;
    private String potenciaLaser6;
    private String potenciaLaser7;
    private String potenciaLaser8;
    private String potenciaLaser9;
    private String potenciaLaser10;
    private String potenciaLaserTotal;
    
    private String modoLaser1;
    private String modoLaser2;
    private String modoLaser3;
    private String modoLaser4;
    private String modoLaser5;
    private String modoLaser6;
    private String modoLaser7;
    private String modoLaser8;
    private String modoLaser9;
    private String modoLaser10;
    private String modoLaserTotal;
    
    private String y1;
    private String y2;
    private String y3;
    private String y4;
    private String y5;
    private String y6;
    private String y7;
    private String y8;
    private String y9;
    private String y10;
    private String yTotal;
    private String z1;
    private String z2;
    private String z3;
    private String z4;
    private String z5;
    private String z6;
    private String z7;
    private String z8;
    private String z9;
    private String z10;
    private String zTotal;
    
    private String h311;
    private String h312;
    private String h313;
    private String h314;
    private String h315;
    private String h316;
    private String h317;
    private String h318;
    private String h319;
    private String h3110;
    private String h31Total;
    private String h611;
    private String h612;
    private String h613;
    private String h614;
    private String h615;
    private String h616;
    private String h617;
    private String h618;
    private String h619;
    private String h6110;
    private String h61Total;
    
    private String velocidadMezclador1;
    private String velocidadMezclador2;
    private String velocidadMezclador3;
    private String velocidadMezclador4;
    private String velocidadMezclador5;
    private String velocidadMezclador6;
    private String velocidadMezclador7;
    private String velocidadMezclador8;
    private String velocidadMezclador9;
    private String velocidadMezclador10;
    private String velocidadMezcladorTotal;
    private String vitTir1;
    private String vitTir2;
    private String vitTir3;
    private String vitTir4;
    private String vitTir5;
    private String vitTir6;
    private String vitTir7;
    private String vitTir8;
    private String vitTir9;
    private String vitTir10;
    private String vitTirTotal;
    private String referencias1;
    private String referencias2;
    private String referencias3;
    private String referencias4;
    private String referencias5;
    private String referencias6;
    private String referencias7;
    private String referencias8;
    private String referencias9;
    private String referencias10;
    private String referenciasTotal;

    private String comentarios;
    private String o2;
    private String h20;
    
    private String tratamientoTermico;
    private String mecanizado;
    private String resultados;

    public int getIdDepot() {
        return idDepot;
    }

    public void setIdDepot(int idDepot) {
        this.idDepot = idDepot;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHeure() {
        return heure;
    }

    public void setHeure(String heure) {
        this.heure = heure;
    }

    public String getMachine() {
        return machine;
    }

    public void setMachine(String machine) {
        this.machine = machine;
    }

    public String getNumeroFiche() {
        return numeroFiche;
    }

    public void setNumeroFiche(String numeroFiche) {
        this.numeroFiche = numeroFiche;
    }

    public String getNumeroCaso() {
        return numeroCaso;
    }

    public void setNumeroCaso(String numeroCaso) {
        this.numeroCaso = numeroCaso;
    }

    public String getNumeroPlaca() {
        return numeroPlaca;
    }

    public void setNumeroPlaca(String numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }

    public String getRefMateriales() {
        return refMateriales;
    }

    public void setRefMateriales(String refMateriales) {
        this.refMateriales = refMateriales;
    }

    public String getPreProceso() {
        return preProceso;
    }

    public void setPreProceso(String preProceso) {
        this.preProceso = preProceso;
    }

    public String getMetas() {
        return metas;
    }

    public void setMetas(String metas) {
        this.metas = metas;
    }

    public String getOpeVerificacion() {
        return opeVerificacion;
    }

    public void setOpeVerificacion(String opeVerificacion) {
        this.opeVerificacion = opeVerificacion;
    }

    public String getLlenGas() {
        return llenGas;
    }

    public void setLlenGas(String llenGas) {
        this.llenGas = llenGas;
    }

    public String getOperador() {
        return operador;
    }

    public void setOperador(String operador) {
        this.operador = operador;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getBoquillaUtilizada() {
        return boquillaUtilizada;
    }

    public void setBoquillaUtilizada(String boquillaUtilizada) {
        this.boquillaUtilizada = boquillaUtilizada;
    }

    public String getTamSustrato() {
        return tamSustrato;
    }

    public void setTamSustrato(String tamSustrato) {
        this.tamSustrato = tamSustrato;
    }

    public String getTamHabitacion() {
        return tamHabitacion;
    }

    public void setTamHabitacion(String tamHabitacion) {
        this.tamHabitacion = tamHabitacion;
    }

    public String getCroquis() {
        return croquis;
    }

    public void setCroquis(String croquis) {
        this.croquis = croquis;
    }

    public String getCentroLaser() {
        return centroLaser;
    }

    public void setCentroLaser(String centroLaser) {
        this.centroLaser = centroLaser;
    }

    public String getSalidaPolvoCabeza() {
        return salidaPolvoCabeza;
    }

    public void setSalidaPolvoCabeza(String salidaPolvoCabeza) {
        this.salidaPolvoCabeza = salidaPolvoCabeza;
    }

    public String getBoquillaPza1() {
        return boquillaPza1;
    }

    public void setBoquillaPza1(String boquillaPza1) {
        this.boquillaPza1 = boquillaPza1;
    }

    public String getBoquillaPza2() {
        return boquillaPza2;
    }

    public void setBoquillaPza2(String boquillaPza2) {
        this.boquillaPza2 = boquillaPza2;
    }

    public String getBoquillaPza3() {
        return boquillaPza3;
    }

    public void setBoquillaPza3(String boquillaPza3) {
        this.boquillaPza3 = boquillaPza3;
    }

    public String getBoquillaPza4() {
        return boquillaPza4;
    }

    public void setBoquillaPza4(String boquillaPza4) {
        this.boquillaPza4 = boquillaPza4;
    }

    public String getBoquillaPza5() {
        return boquillaPza5;
    }

    public void setBoquillaPza5(String boquillaPza5) {
        this.boquillaPza5 = boquillaPza5;
    }

    public String getBoquillaPza6() {
        return boquillaPza6;
    }

    public void setBoquillaPza6(String boquillaPza6) {
        this.boquillaPza6 = boquillaPza6;
    }

    public String getBoquillaPza7() {
        return boquillaPza7;
    }

    public void setBoquillaPza7(String boquillaPza7) {
        this.boquillaPza7 = boquillaPza7;
    }

    public String getBoquillaPza8() {
        return boquillaPza8;
    }

    public void setBoquillaPza8(String boquillaPza8) {
        this.boquillaPza8 = boquillaPza8;
    }

    public String getBoquillaPza9() {
        return boquillaPza9;
    }

    public void setBoquillaPza9(String boquillaPza9) {
        this.boquillaPza9 = boquillaPza9;
    }

    public String getBoquillaPza10() {
        return boquillaPza10;
    }

    public void setBoquillaPza10(String boquillaPza10) {
        this.boquillaPza10 = boquillaPza10;
    }

    public String getBoquillaPzaTotal() {
        return boquillaPzaTotal;
    }

    public void setBoquillaPzaTotal(String boquillaPzaTotal) {
        this.boquillaPzaTotal = boquillaPzaTotal;
    }

    public String getVelocidadMaquina1() {
        return velocidadMaquina1;
    }

    public void setVelocidadMaquina1(String velocidadMaquina1) {
        this.velocidadMaquina1 = velocidadMaquina1;
    }

    public String getVelocidadMaquina2() {
        return velocidadMaquina2;
    }

    public void setVelocidadMaquina2(String velocidadMaquina2) {
        this.velocidadMaquina2 = velocidadMaquina2;
    }

    public String getVelocidadMaquina3() {
        return velocidadMaquina3;
    }

    public void setVelocidadMaquina3(String velocidadMaquina3) {
        this.velocidadMaquina3 = velocidadMaquina3;
    }

    public String getVelocidadMaquina4() {
        return velocidadMaquina4;
    }

    public void setVelocidadMaquina4(String velocidadMaquina4) {
        this.velocidadMaquina4 = velocidadMaquina4;
    }

    public String getVelocidadMaquina5() {
        return velocidadMaquina5;
    }

    public void setVelocidadMaquina5(String velocidadMaquina5) {
        this.velocidadMaquina5 = velocidadMaquina5;
    }

    public String getVelocidadMaquina6() {
        return velocidadMaquina6;
    }

    public void setVelocidadMaquina6(String velocidadMaquina6) {
        this.velocidadMaquina6 = velocidadMaquina6;
    }

    public String getVelocidadMaquina7() {
        return velocidadMaquina7;
    }

    public void setVelocidadMaquina7(String velocidadMaquina7) {
        this.velocidadMaquina7 = velocidadMaquina7;
    }

    public String getVelocidadMaquina8() {
        return velocidadMaquina8;
    }

    public void setVelocidadMaquina8(String velocidadMaquina8) {
        this.velocidadMaquina8 = velocidadMaquina8;
    }

    public String getVelocidadMaquina9() {
        return velocidadMaquina9;
    }

    public void setVelocidadMaquina9(String velocidadMaquina9) {
        this.velocidadMaquina9 = velocidadMaquina9;
    }

    public String getVelocidadMaquina10() {
        return velocidadMaquina10;
    }

    public void setVelocidadMaquina10(String velocidadMaquina10) {
        this.velocidadMaquina10 = velocidadMaquina10;
    }

    public String getVelocidadMaquinaTotal() {
        return velocidadMaquinaTotal;
    }

    public void setVelocidadMaquinaTotal(String velocidadMaquinaTotal) {
        this.velocidadMaquinaTotal = velocidadMaquinaTotal;
    }

    public String getHigometria1() {
        return higometria1;
    }

    public void setHigometria1(String higometria1) {
        this.higometria1 = higometria1;
    }

    public String getHigometria2() {
        return higometria2;
    }

    public void setHigometria2(String higometria2) {
        this.higometria2 = higometria2;
    }

    public String getHigometria3() {
        return higometria3;
    }

    public void setHigometria3(String higometria3) {
        this.higometria3 = higometria3;
    }

    public String getHigometria4() {
        return higometria4;
    }

    public void setHigometria4(String higometria4) {
        this.higometria4 = higometria4;
    }

    public String getHigometria5() {
        return higometria5;
    }

    public void setHigometria5(String higometria5) {
        this.higometria5 = higometria5;
    }

    public String getHigometria6() {
        return higometria6;
    }

    public void setHigometria6(String higometria6) {
        this.higometria6 = higometria6;
    }

    public String getHigometria7() {
        return higometria7;
    }

    public void setHigometria7(String higometria7) {
        this.higometria7 = higometria7;
    }

    public String getHigometria8() {
        return higometria8;
    }

    public void setHigometria8(String higometria8) {
        this.higometria8 = higometria8;
    }

    public String getHigometria9() {
        return higometria9;
    }

    public void setHigometria9(String higometria9) {
        this.higometria9 = higometria9;
    }

    public String getHigometria10() {
        return higometria10;
    }

    public void setHigometria10(String higometria10) {
        this.higometria10 = higometria10;
    }

    public String getHigometriaTotal() {
        return higometriaTotal;
    }

    public void setHigometriaTotal(String higometriaTotal) {
        this.higometriaTotal = higometriaTotal;
    }

    public String getTemperatura1() {
        return temperatura1;
    }

    public void setTemperatura1(String temperatura1) {
        this.temperatura1 = temperatura1;
    }

    public String getTemperatura2() {
        return temperatura2;
    }

    public void setTemperatura2(String temperatura2) {
        this.temperatura2 = temperatura2;
    }

    public String getTemperatura3() {
        return temperatura3;
    }

    public void setTemperatura3(String temperatura3) {
        this.temperatura3 = temperatura3;
    }

    public String getTemperatura4() {
        return temperatura4;
    }

    public void setTemperatura4(String temperatura4) {
        this.temperatura4 = temperatura4;
    }

    public String getTemperatura5() {
        return temperatura5;
    }

    public void setTemperatura5(String temperatura5) {
        this.temperatura5 = temperatura5;
    }

    public String getTemperatura6() {
        return temperatura6;
    }

    public void setTemperatura6(String temperatura6) {
        this.temperatura6 = temperatura6;
    }

    public String getTemperatura7() {
        return temperatura7;
    }

    public void setTemperatura7(String temperatura7) {
        this.temperatura7 = temperatura7;
    }

    public String getTemperatura8() {
        return temperatura8;
    }

    public void setTemperatura8(String temperatura8) {
        this.temperatura8 = temperatura8;
    }

    public String getTemperatura9() {
        return temperatura9;
    }

    public void setTemperatura9(String temperatura9) {
        this.temperatura9 = temperatura9;
    }

    public String getTemperatura10() {
        return temperatura10;
    }

    public void setTemperatura10(String temperatura10) {
        this.temperatura10 = temperatura10;
    }

    public String getTemperaturaTotal() {
        return temperaturaTotal;
    }

    public void setTemperaturaTotal(String temperaturaTotal) {
        this.temperaturaTotal = temperaturaTotal;
    }

    public String getTemporizador1() {
        return temporizador1;
    }

    public void setTemporizador1(String temporizador1) {
        this.temporizador1 = temporizador1;
    }

    public String getTemporizador2() {
        return temporizador2;
    }

    public void setTemporizador2(String temporizador2) {
        this.temporizador2 = temporizador2;
    }

    public String getTemporizador3() {
        return temporizador3;
    }

    public void setTemporizador3(String temporizador3) {
        this.temporizador3 = temporizador3;
    }

    public String getTemporizador4() {
        return temporizador4;
    }

    public void setTemporizador4(String temporizador4) {
        this.temporizador4 = temporizador4;
    }

    public String getTemporizador5() {
        return temporizador5;
    }

    public void setTemporizador5(String temporizador5) {
        this.temporizador5 = temporizador5;
    }

    public String getTemporizador6() {
        return temporizador6;
    }

    public void setTemporizador6(String temporizador6) {
        this.temporizador6 = temporizador6;
    }

    public String getTemporizador7() {
        return temporizador7;
    }

    public void setTemporizador7(String temporizador7) {
        this.temporizador7 = temporizador7;
    }

    public String getTemporizador8() {
        return temporizador8;
    }

    public void setTemporizador8(String temporizador8) {
        this.temporizador8 = temporizador8;
    }

    public String getTemporizador9() {
        return temporizador9;
    }

    public void setTemporizador9(String temporizador9) {
        this.temporizador9 = temporizador9;
    }

    public String getTemporizador10() {
        return temporizador10;
    }

    public void setTemporizador10(String temporizador10) {
        this.temporizador10 = temporizador10;
    }

    public String getTemporizadorTotal() {
        return temporizadorTotal;
    }

    public void setTemporizadorTotal(String temporizadorTotal) {
        this.temporizadorTotal = temporizadorTotal;
    }

    public String getSalidaPolvo1() {
        return salidaPolvo1;
    }

    public void setSalidaPolvo1(String salidaPolvo1) {
        this.salidaPolvo1 = salidaPolvo1;
    }

    public String getSalidaPolvo2() {
        return salidaPolvo2;
    }

    public void setSalidaPolvo2(String salidaPolvo2) {
        this.salidaPolvo2 = salidaPolvo2;
    }

    public String getSalidaPolvo3() {
        return salidaPolvo3;
    }

    public void setSalidaPolvo3(String salidaPolvo3) {
        this.salidaPolvo3 = salidaPolvo3;
    }

    public String getSalidaPolvo4() {
        return salidaPolvo4;
    }

    public void setSalidaPolvo4(String salidaPolvo4) {
        this.salidaPolvo4 = salidaPolvo4;
    }

    public String getSalidaPolvo5() {
        return salidaPolvo5;
    }

    public void setSalidaPolvo5(String salidaPolvo5) {
        this.salidaPolvo5 = salidaPolvo5;
    }

    public String getSalidaPolvo6() {
        return salidaPolvo6;
    }

    public void setSalidaPolvo6(String salidaPolvo6) {
        this.salidaPolvo6 = salidaPolvo6;
    }

    public String getSalidaPolvo7() {
        return salidaPolvo7;
    }

    public void setSalidaPolvo7(String salidaPolvo7) {
        this.salidaPolvo7 = salidaPolvo7;
    }

    public String getSalidaPolvo8() {
        return salidaPolvo8;
    }

    public void setSalidaPolvo8(String salidaPolvo8) {
        this.salidaPolvo8 = salidaPolvo8;
    }

    public String getSalidaPolvo9() {
        return salidaPolvo9;
    }

    public void setSalidaPolvo9(String salidaPolvo9) {
        this.salidaPolvo9 = salidaPolvo9;
    }

    public String getSalidaPolvo10() {
        return salidaPolvo10;
    }

    public void setSalidaPolvo10(String salidaPolvo10) {
        this.salidaPolvo10 = salidaPolvo10;
    }

    public String getSalidaPolvoTotal() {
        return salidaPolvoTotal;
    }

    public void setSalidaPolvoTotal(String salidaPolvoTotal) {
        this.salidaPolvoTotal = salidaPolvoTotal;
    }

    public String getGanulometria1() {
        return ganulometria1;
    }

    public void setGanulometria1(String ganulometria1) {
        this.ganulometria1 = ganulometria1;
    }

    public String getGanulometria2() {
        return ganulometria2;
    }

    public void setGanulometria2(String ganulometria2) {
        this.ganulometria2 = ganulometria2;
    }

    public String getGanulometria3() {
        return ganulometria3;
    }

    public void setGanulometria3(String ganulometria3) {
        this.ganulometria3 = ganulometria3;
    }

    public String getGanulometria4() {
        return ganulometria4;
    }

    public void setGanulometria4(String ganulometria4) {
        this.ganulometria4 = ganulometria4;
    }

    public String getGanulometria5() {
        return ganulometria5;
    }

    public void setGanulometria5(String ganulometria5) {
        this.ganulometria5 = ganulometria5;
    }

    public String getGanulometria6() {
        return ganulometria6;
    }

    public void setGanulometria6(String ganulometria6) {
        this.ganulometria6 = ganulometria6;
    }

    public String getGanulometria7() {
        return ganulometria7;
    }

    public void setGanulometria7(String ganulometria7) {
        this.ganulometria7 = ganulometria7;
    }

    public String getGanulometria8() {
        return ganulometria8;
    }

    public void setGanulometria8(String ganulometria8) {
        this.ganulometria8 = ganulometria8;
    }

    public String getGanulometria9() {
        return ganulometria9;
    }

    public void setGanulometria9(String ganulometria9) {
        this.ganulometria9 = ganulometria9;
    }

    public String getGanulometria10() {
        return ganulometria10;
    }

    public void setGanulometria10(String ganulometria10) {
        this.ganulometria10 = ganulometria10;
    }

    public String getGanulometriaTotal() {
        return ganulometriaTotal;
    }

    public void setGanulometriaTotal(String ganulometriaTotal) {
        this.ganulometriaTotal = ganulometriaTotal;
    }

    public String getPotenciaLaser1() {
        return potenciaLaser1;
    }

    public void setPotenciaLaser1(String potenciaLaser1) {
        this.potenciaLaser1 = potenciaLaser1;
    }

    public String getPotenciaLaser2() {
        return potenciaLaser2;
    }

    public void setPotenciaLaser2(String potenciaLaser2) {
        this.potenciaLaser2 = potenciaLaser2;
    }

    public String getPotenciaLaser3() {
        return potenciaLaser3;
    }

    public void setPotenciaLaser3(String potenciaLaser3) {
        this.potenciaLaser3 = potenciaLaser3;
    }

    public String getPotenciaLaser4() {
        return potenciaLaser4;
    }

    public void setPotenciaLaser4(String potenciaLaser4) {
        this.potenciaLaser4 = potenciaLaser4;
    }

    public String getPotenciaLaser5() {
        return potenciaLaser5;
    }

    public void setPotenciaLaser5(String potenciaLaser5) {
        this.potenciaLaser5 = potenciaLaser5;
    }

    public String getPotenciaLaser6() {
        return potenciaLaser6;
    }

    public void setPotenciaLaser6(String potenciaLaser6) {
        this.potenciaLaser6 = potenciaLaser6;
    }

    public String getPotenciaLaser7() {
        return potenciaLaser7;
    }

    public void setPotenciaLaser7(String potenciaLaser7) {
        this.potenciaLaser7 = potenciaLaser7;
    }

    public String getPotenciaLaser8() {
        return potenciaLaser8;
    }

    public void setPotenciaLaser8(String potenciaLaser8) {
        this.potenciaLaser8 = potenciaLaser8;
    }

    public String getPotenciaLaser9() {
        return potenciaLaser9;
    }

    public void setPotenciaLaser9(String potenciaLaser9) {
        this.potenciaLaser9 = potenciaLaser9;
    }

    public String getPotenciaLaser10() {
        return potenciaLaser10;
    }

    public void setPotenciaLaser10(String potenciaLaser10) {
        this.potenciaLaser10 = potenciaLaser10;
    }

    public String getPotenciaLaserTotal() {
        return potenciaLaserTotal;
    }

    public void setPotenciaLaserTotal(String potenciaLaserTotal) {
        this.potenciaLaserTotal = potenciaLaserTotal;
    }

    public String getModoLaser1() {
        return modoLaser1;
    }

    public void setModoLaser1(String modoLaser1) {
        this.modoLaser1 = modoLaser1;
    }

    public String getModoLaser2() {
        return modoLaser2;
    }

    public void setModoLaser2(String modoLaser2) {
        this.modoLaser2 = modoLaser2;
    }

    public String getModoLaser3() {
        return modoLaser3;
    }

    public void setModoLaser3(String modoLaser3) {
        this.modoLaser3 = modoLaser3;
    }

    public String getModoLaser4() {
        return modoLaser4;
    }

    public void setModoLaser4(String modoLaser4) {
        this.modoLaser4 = modoLaser4;
    }

    public String getModoLaser5() {
        return modoLaser5;
    }

    public void setModoLaser5(String modoLaser5) {
        this.modoLaser5 = modoLaser5;
    }

    public String getModoLaser6() {
        return modoLaser6;
    }

    public void setModoLaser6(String modoLaser6) {
        this.modoLaser6 = modoLaser6;
    }

    public String getModoLaser7() {
        return modoLaser7;
    }

    public void setModoLaser7(String modoLaser7) {
        this.modoLaser7 = modoLaser7;
    }

    public String getModoLaser8() {
        return modoLaser8;
    }

    public void setModoLaser8(String modoLaser8) {
        this.modoLaser8 = modoLaser8;
    }

    public String getModoLaser9() {
        return modoLaser9;
    }

    public void setModoLaser9(String modoLaser9) {
        this.modoLaser9 = modoLaser9;
    }

    public String getModoLaser10() {
        return modoLaser10;
    }

    public void setModoLaser10(String modoLaser10) {
        this.modoLaser10 = modoLaser10;
    }

    public String getModoLaserTotal() {
        return modoLaserTotal;
    }

    public void setModoLaserTotal(String modoLaserTotal) {
        this.modoLaserTotal = modoLaserTotal;
    }

    public String getY1() {
        return y1;
    }

    public void setY1(String y1) {
        this.y1 = y1;
    }

    public String getY2() {
        return y2;
    }

    public void setY2(String y2) {
        this.y2 = y2;
    }

    public String getY3() {
        return y3;
    }

    public void setY3(String y3) {
        this.y3 = y3;
    }

    public String getY4() {
        return y4;
    }

    public void setY4(String y4) {
        this.y4 = y4;
    }

    public String getY5() {
        return y5;
    }

    public void setY5(String y5) {
        this.y5 = y5;
    }

    public String getY6() {
        return y6;
    }

    public void setY6(String y6) {
        this.y6 = y6;
    }

    public String getY7() {
        return y7;
    }

    public void setY7(String y7) {
        this.y7 = y7;
    }

    public String getY8() {
        return y8;
    }

    public void setY8(String y8) {
        this.y8 = y8;
    }

    public String getY9() {
        return y9;
    }

    public void setY9(String y9) {
        this.y9 = y9;
    }

    public String getY10() {
        return y10;
    }

    public void setY10(String y10) {
        this.y10 = y10;
    }

    public String getyTotal() {
        return yTotal;
    }

    public void setyTotal(String yTotal) {
        this.yTotal = yTotal;
    }

    public String getZ1() {
        return z1;
    }

    public void setZ1(String z1) {
        this.z1 = z1;
    }

    public String getZ2() {
        return z2;
    }

    public void setZ2(String z2) {
        this.z2 = z2;
    }

    public String getZ3() {
        return z3;
    }

    public void setZ3(String z3) {
        this.z3 = z3;
    }

    public String getZ4() {
        return z4;
    }

    public void setZ4(String z4) {
        this.z4 = z4;
    }

    public String getZ5() {
        return z5;
    }

    public void setZ5(String z5) {
        this.z5 = z5;
    }

    public String getZ6() {
        return z6;
    }

    public void setZ6(String z6) {
        this.z6 = z6;
    }

    public String getZ7() {
        return z7;
    }

    public void setZ7(String z7) {
        this.z7 = z7;
    }

    public String getZ8() {
        return z8;
    }

    public void setZ8(String z8) {
        this.z8 = z8;
    }

    public String getZ9() {
        return z9;
    }

    public void setZ9(String z9) {
        this.z9 = z9;
    }

    public String getZ10() {
        return z10;
    }

    public void setZ10(String z10) {
        this.z10 = z10;
    }

    public String getzTotal() {
        return zTotal;
    }

    public void setzTotal(String zTotal) {
        this.zTotal = zTotal;
    }

    public String getH311() {
        return h311;
    }

    public void setH311(String h311) {
        this.h311 = h311;
    }

    public String getH312() {
        return h312;
    }

    public void setH312(String h312) {
        this.h312 = h312;
    }

    public String getH313() {
        return h313;
    }

    public void setH313(String h313) {
        this.h313 = h313;
    }

    public String getH314() {
        return h314;
    }

    public void setH314(String h314) {
        this.h314 = h314;
    }

    public String getH315() {
        return h315;
    }

    public void setH315(String h315) {
        this.h315 = h315;
    }

    public String getH316() {
        return h316;
    }

    public void setH316(String h316) {
        this.h316 = h316;
    }

    public String getH317() {
        return h317;
    }

    public void setH317(String h317) {
        this.h317 = h317;
    }

    public String getH318() {
        return h318;
    }

    public void setH318(String h318) {
        this.h318 = h318;
    }

    public String getH319() {
        return h319;
    }

    public void setH319(String h319) {
        this.h319 = h319;
    }

    public String getH3110() {
        return h3110;
    }

    public void setH3110(String h3110) {
        this.h3110 = h3110;
    }

    public String getH31Total() {
        return h31Total;
    }

    public void setH31Total(String h31Total) {
        this.h31Total = h31Total;
    }

    public String getH611() {
        return h611;
    }

    public void setH611(String h611) {
        this.h611 = h611;
    }

    public String getH612() {
        return h612;
    }

    public void setH612(String h612) {
        this.h612 = h612;
    }

    public String getH613() {
        return h613;
    }

    public void setH613(String h613) {
        this.h613 = h613;
    }

    public String getH614() {
        return h614;
    }

    public void setH614(String h614) {
        this.h614 = h614;
    }

    public String getH615() {
        return h615;
    }

    public void setH615(String h615) {
        this.h615 = h615;
    }

    public String getH616() {
        return h616;
    }

    public void setH616(String h616) {
        this.h616 = h616;
    }

    public String getH617() {
        return h617;
    }

    public void setH617(String h617) {
        this.h617 = h617;
    }

    public String getH618() {
        return h618;
    }

    public void setH618(String h618) {
        this.h618 = h618;
    }

    public String getH619() {
        return h619;
    }

    public void setH619(String h619) {
        this.h619 = h619;
    }

    public String getH6110() {
        return h6110;
    }

    public void setH6110(String h6110) {
        this.h6110 = h6110;
    }

    public String getH61Total() {
        return h61Total;
    }

    public void setH61Total(String h61Total) {
        this.h61Total = h61Total;
    }

    public String getVelocidadMezclador1() {
        return velocidadMezclador1;
    }

    public void setVelocidadMezclador1(String velocidadMezclador1) {
        this.velocidadMezclador1 = velocidadMezclador1;
    }

    public String getVelocidadMezclador2() {
        return velocidadMezclador2;
    }

    public void setVelocidadMezclador2(String velocidadMezclador2) {
        this.velocidadMezclador2 = velocidadMezclador2;
    }

    public String getVelocidadMezclador3() {
        return velocidadMezclador3;
    }

    public void setVelocidadMezclador3(String velocidadMezclador3) {
        this.velocidadMezclador3 = velocidadMezclador3;
    }

    public String getVelocidadMezclador4() {
        return velocidadMezclador4;
    }

    public void setVelocidadMezclador4(String velocidadMezclador4) {
        this.velocidadMezclador4 = velocidadMezclador4;
    }

    public String getVelocidadMezclador5() {
        return velocidadMezclador5;
    }

    public void setVelocidadMezclador5(String velocidadMezclador5) {
        this.velocidadMezclador5 = velocidadMezclador5;
    }

    public String getVelocidadMezclador6() {
        return velocidadMezclador6;
    }

    public void setVelocidadMezclador6(String velocidadMezclador6) {
        this.velocidadMezclador6 = velocidadMezclador6;
    }

    public String getVelocidadMezclador7() {
        return velocidadMezclador7;
    }

    public void setVelocidadMezclador7(String velocidadMezclador7) {
        this.velocidadMezclador7 = velocidadMezclador7;
    }

    public String getVelocidadMezclador8() {
        return velocidadMezclador8;
    }

    public void setVelocidadMezclador8(String velocidadMezclador8) {
        this.velocidadMezclador8 = velocidadMezclador8;
    }

    public String getVelocidadMezclador9() {
        return velocidadMezclador9;
    }

    public void setVelocidadMezclador9(String velocidadMezclador9) {
        this.velocidadMezclador9 = velocidadMezclador9;
    }

    public String getVelocidadMezclador10() {
        return velocidadMezclador10;
    }

    public void setVelocidadMezclador10(String velocidadMezclador10) {
        this.velocidadMezclador10 = velocidadMezclador10;
    }

    public String getVelocidadMezcladorTotal() {
        return velocidadMezcladorTotal;
    }

    public void setVelocidadMezcladorTotal(String velocidadMezcladorTotal) {
        this.velocidadMezcladorTotal = velocidadMezcladorTotal;
    }

    public String getVitTir1() {
        return vitTir1;
    }

    public void setVitTir1(String vitTir1) {
        this.vitTir1 = vitTir1;
    }

    public String getVitTir2() {
        return vitTir2;
    }

    public void setVitTir2(String vitTir2) {
        this.vitTir2 = vitTir2;
    }

    public String getVitTir3() {
        return vitTir3;
    }

    public void setVitTir3(String vitTir3) {
        this.vitTir3 = vitTir3;
    }

    public String getVitTir4() {
        return vitTir4;
    }

    public void setVitTir4(String vitTir4) {
        this.vitTir4 = vitTir4;
    }

    public String getVitTir5() {
        return vitTir5;
    }

    public void setVitTir5(String vitTir5) {
        this.vitTir5 = vitTir5;
    }

    public String getVitTir6() {
        return vitTir6;
    }

    public void setVitTir6(String vitTir6) {
        this.vitTir6 = vitTir6;
    }

    public String getVitTir7() {
        return vitTir7;
    }

    public void setVitTir7(String vitTir7) {
        this.vitTir7 = vitTir7;
    }

    public String getVitTir8() {
        return vitTir8;
    }

    public void setVitTir8(String vitTir8) {
        this.vitTir8 = vitTir8;
    }

    public String getVitTir9() {
        return vitTir9;
    }

    public void setVitTir9(String vitTir9) {
        this.vitTir9 = vitTir9;
    }

    public String getVitTir10() {
        return vitTir10;
    }

    public void setVitTir10(String vitTir10) {
        this.vitTir10 = vitTir10;
    }

    public String getVitTirTotal() {
        return vitTirTotal;
    }

    public void setVitTirTotal(String vitTirTotal) {
        this.vitTirTotal = vitTirTotal;
    }

    public String getReferencias1() {
        return referencias1;
    }

    public void setReferencias1(String referencias1) {
        this.referencias1 = referencias1;
    }

    public String getReferencias2() {
        return referencias2;
    }

    public void setReferencias2(String referencias2) {
        this.referencias2 = referencias2;
    }

    public String getReferencias3() {
        return referencias3;
    }

    public void setReferencias3(String referencias3) {
        this.referencias3 = referencias3;
    }

    public String getReferencias4() {
        return referencias4;
    }

    public void setReferencias4(String referencias4) {
        this.referencias4 = referencias4;
    }

    public String getReferencias5() {
        return referencias5;
    }

    public void setReferencias5(String referencias5) {
        this.referencias5 = referencias5;
    }

    public String getReferencias6() {
        return referencias6;
    }

    public void setReferencias6(String referencias6) {
        this.referencias6 = referencias6;
    }

    public String getReferencias7() {
        return referencias7;
    }

    public void setReferencias7(String referencias7) {
        this.referencias7 = referencias7;
    }

    public String getReferencias8() {
        return referencias8;
    }

    public void setReferencias8(String referencias8) {
        this.referencias8 = referencias8;
    }

    public String getReferencias9() {
        return referencias9;
    }

    public void setReferencias9(String referencias9) {
        this.referencias9 = referencias9;
    }

    public String getReferencias10() {
        return referencias10;
    }

    public void setReferencias10(String referencias10) {
        this.referencias10 = referencias10;
    }

    public String getReferenciasTotal() {
        return referenciasTotal;
    }

    public void setReferenciasTotal(String referenciasTotal) {
        this.referenciasTotal = referenciasTotal;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }

    public String getO2() {
        return o2;
    }

    public void setO2(String o2) {
        this.o2 = o2;
    }

    public String getH20() {
        return h20;
    }

    public void setH20(String h20) {
        this.h20 = h20;
    }

    public String getTratamientoTermico() {
        return tratamientoTermico;
    }

    public void setTratamientoTermico(String tratamientoTermico) {
        this.tratamientoTermico = tratamientoTermico;
    }

    public String getMecanizado() {
        return mecanizado;
    }

    public void setMecanizado(String mecanizado) {
        this.mecanizado = mecanizado;
    }

    public String getResultados() {
        return resultados;
    }

    public void setResultados(String resultados) {
        this.resultados = resultados;
    }
    
    public String getD1() {
        return d1;
    }

    public void setD1(String d1) {
        this.d1 = d1;
    }

    public String getD2() {
        return d2;
    }

    public void setD2(String d2) {
        this.d2 = d2;
    }

    public String getD3() {
        return d3;
    }

    public void setD3(String d3) {
        this.d3 = d3;
    }

    public String getD4() {
        return d4;
    }

    public void setD4(String d4) {
        this.d4 = d4;
    }

    public String getD5() {
        return d5;
    }

    public void setD5(String d5) {
        this.d5 = d5;
    }

    public String getD6() {
        return d6;
    }

    public void setD6(String d6) {
        this.d6 = d6;
    }

    public String getD7() {
        return d7;
    }

    public void setD7(String d7) {
        this.d7 = d7;
    }

    public String getD8() {
        return d8;
    }

    public void setD8(String d8) {
        this.d8 = d8;
    }

    public String getD9() {
        return d9;
    }

    public void setD9(String d9) {
        this.d9 = d9;
    }

    public String getD10() {
        return d10;
    }

    public void setD10(String d10) {
        this.d10 = d10;
    }

    public String getdTotal() {
        return dTotal;
    }

    public void setdTotal(String dTotal) {
        this.dTotal = dTotal;
    }
    
}
