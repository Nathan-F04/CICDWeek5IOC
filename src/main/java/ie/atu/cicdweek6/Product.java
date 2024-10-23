package ie.atu.cicdweek6;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @PositiveOrZero(message="You must enter a valid id!")
    private int id;
    @NotBlank(message="You must enter a name!")
    private String name;
    @PositiveOrZero(message="You must enter a valid price!")
    private double price;
}
