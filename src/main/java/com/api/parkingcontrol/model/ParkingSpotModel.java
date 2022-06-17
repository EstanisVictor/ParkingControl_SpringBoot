package com.api.parkingcontrol.model;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.UUID;

/*
* Transformando a classe em uma entidade, ela precisa de um indentificador que é o nosso "@ID"
* */
@Entity

/*
Irá gerar uma tabela automaticamente no banco de dados
* */
@Table(name = "TB_PARKING_SPOT")

public class ParkingSpotModel implements Serializable {
    private static final long serialVersionUID = 1L;
    //Gerando as colunas da tabela automaticamente
    @Id
    //Gerando o ID automatico
    @GeneratedValue(strategy = GenerationType.AUTO) private UUID id;
    /*
    * Numero das vagas do condominio, está em String caso o numero da vaga tenha letras
    * Unique é para ser um campo unico (não ter dois cadastros em uma mesma vaga)
    * */
    @Column(nullable = false, unique = true, length = 10) private String parkingSpotNumber;
    //Placa do carro
    @Column(nullable = false, unique = true, length = 7) private String licensePlateCar;
    //Marca do carro
    @Column(nullable = false, length = 70) private String brandCar;
    //Modelo do carro
    @Column(nullable = false, length = 70) private String modelCar;
    //Cor do carro
    @Column(nullable = false, length = 70) private String colorCar;
    //Data de registro da vaga
    @Column(nullable = false) private LocalDateTime registrationDate;
    //Nome do responsável
    @Column(nullable = false, length = 130) private String responsibleName;
    //Apartamento
    @Column(nullable = false, length = 30) private String apartment;
    //Bloco ou torres do condomínio
    @Column(nullable = false, length = 30) private String block;

    //Metodos de encapsulamento (Getters and Setters)
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(String parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public String getLicensePlateCar() {
        return licensePlateCar;
    }

    public void setLicensePlateCar(String licensePlateCar) {
        this.licensePlateCar = licensePlateCar;
    }

    public String getBrandCar() {
        return brandCar;
    }

    public void setBrandCar(String brandCar) {
        this.brandCar = brandCar;
    }

    public String getModelCar() {
        return modelCar;
    }

    public void setModelCar(String modelCar) {
        this.modelCar = modelCar;
    }

    public String getColorCar() {
        return colorCar;
    }

    public void setColorCar(String colorCar) {
        this.colorCar = colorCar;
    }

    public LocalDateTime getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(LocalDateTime registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getResponsibleName() {
        return responsibleName;
    }

    public void setResponsibleName(String responsibleName) {
        this.responsibleName = responsibleName;
    }

    public String getApartment() {
        return apartment;
    }

    public void setApartment(String apartment) {
        this.apartment = apartment;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }
}
