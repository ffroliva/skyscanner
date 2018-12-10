package br.com.ffroliva.skyscanner.entity.pricing;

public class PollResults {

    /**
     * OPTIONAL
     * The parameter to sort results on.
     * Can be carrier, duration, outboundarrivetime, outbounddeparttime, inboundarrivetime, inbounddeparttime, price*
     */
    private String sortType;

    /**
     * OPTIONAL
     * The sort order. ‘asc’ or 'desc’
     */
    private String sortOrder;

    /**
     * Filter for maximum duration in minutes. Integer between 0 and 1800
     */
    private String duration;
}
