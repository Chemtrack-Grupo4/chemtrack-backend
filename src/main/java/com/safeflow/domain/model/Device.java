package com.safeflow.domain.model;

import com.safeflow.domain.model.valueobjects.InputDataSensor;
import com.safeflow.domain.services.validate.ValidateSensorStrategyImplements;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="sensors")
public class Device {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "owner_id", nullable = false)
    private Long ownerId;

    @Column(name = "safe", nullable = false)
    private boolean safe;


    public Device updateSafeState(InputDataSensor inputDataSensor) {

        this.safe = ValidateSensorStrategyImplements.isValid(inputDataSensor);
        return this;
    }
    public  void isTrue() {
        this.safe=true;
    }
}
