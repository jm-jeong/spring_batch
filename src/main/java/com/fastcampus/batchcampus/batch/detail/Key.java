package com.fastcampus.batchcampus.batch.detail;

import java.io.Serializable;

public record Key(Long customerId, Long serviceId) implements Serializable {
}
