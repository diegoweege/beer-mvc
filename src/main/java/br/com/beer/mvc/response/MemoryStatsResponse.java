package br.com.beer.mvc.response;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MemoryStatsResponse {
    private long heapSize;
    private long heapMaxSize;
    private long heapFreeSize;
}
