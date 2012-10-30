package org.cloudbus.cloudsim.incubator.web.workload;

import org.cloudbus.cloudsim.incubator.web.WebSession;

/**
 * Generates sessions per given time.
 * 
 * @author nikolay.grozev
 *
 */
public interface ISessionGenerator {

    /**
     * Generates a session for the specified time.
     * 
     * @param time - the time to generate the session for. Must be a valid simulation time.
     * @return the generated session.
     */
    public WebSession generateSessionAt(final double time);
}
