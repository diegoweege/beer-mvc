package br.com.beer.mvc.request;

import java.math.BigDecimal;

import br.com.beer.mvc.domain.BeerType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "image")
public class BeerRequest {

    private String name;
    private String type;
    private BigDecimal value;
    private Double content;
    private byte[] image;

}
