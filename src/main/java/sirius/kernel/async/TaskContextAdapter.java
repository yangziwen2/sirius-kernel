/*
 * Made with all the love in the world
 * by scireum in Remshalden, Germany
 *
 * Copyright by scireum GmbH
 * http://www.scireum.de - info@scireum.de
 */

package sirius.kernel.async;

/**
 * Implementations of this interface can be attached to a {@link sirius.kernel.async.TaskContext} of a thread to
 * perform
 * monitoring and logging.
 */
public interface TaskContextAdapter {
    /**
     * Invoked if {@link sirius.kernel.async.TaskContext#log(String, Object...)} is called in the attached context.
     *
     * @param message the message to log
     */
    void log(String message);

    /**
     * Invoked if {@link sirius.kernel.async.TaskContext#trace(String, Object...)} is called in the attached context.
     *
     * @param message the message to log
     */
    void trace(String message);

    /**
     * Invoked if {@link sirius.kernel.async.TaskContext#setState(String, Object...)} is called in the attached
     * context.
     *
     * @param message the message to set as state
     */
    void setState(String message);

    /**
     * Invoked if {@link TaskContext#markErroneous()} is called in the attached context.
     */
    void markErroneous();

    /**
     * Invoked if {@link sirius.kernel.async.TaskContext#cancel()} is called in the attached context.
     */
    void cancel();

    /**
     * Determines if the current task is still "active" and processing should continue.
     *
     * @return <tt>true</tt> if execution should be continued, <tt>false</tt> otherwise
     */
    boolean isActive();
}
