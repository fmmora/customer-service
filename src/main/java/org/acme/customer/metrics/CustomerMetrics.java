package org.acme.customer.metrics;

import jakarta.enterprise.context.ApplicationScoped;
import org.eclipse.microprofile.metrics.Counter;
import org.eclipse.microprofile.metrics.annotation.Metric;

@ApplicationScoped
public class CustomerMetrics {

    @Metric(name = "customer_lookup_total", description = "Total customer lookup requests")
    Counter lookupCounter;

    @Metric(name = "customer_not_found_total", description = "Total customer not found errors")
    Counter notFoundCounter;

    public void incrementLookup() {
        lookupCounter.inc();
    }

    public void incrementNotFound() {
        notFoundCounter.inc();
    }
}
