package ma.abdex.event_sourcing_cqrs_spring_axon.queries.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor @NoArgsConstructor
public class GetAccountQueryDTO {
    private String id;
}
