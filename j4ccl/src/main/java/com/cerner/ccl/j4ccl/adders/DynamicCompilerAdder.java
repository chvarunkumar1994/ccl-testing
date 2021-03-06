package com.cerner.ccl.j4ccl.adders;

/**
 * Add a command to compile a *.INC file inside of a wrapper dummy script in the CCL dictionary.
 *
 * @author Joshua Hyde
 * @param <D>
 *            The type of {@link DynamicCompilerAdder} to be returned as part of this compiler's use.
 *
 */

public interface DynamicCompilerAdder<D extends DynamicCompilerAdder<?>> extends ScriptCompilerAdder<D> {
    /**
     * Set the name of the script to be generated around the *.INC file. Normally, this name is dynamically generated by
     * this adder; however, this value can be manually set. <br>
     * This is an optional action.
     *
     * @param scriptName
     *            The name of the script into which the *.INC file will be compiled.
     * @return This object.
     * @throws IllegalArgumentException
     *             If the given script name is blank, contains only whitespace, or exceeds the maximum script name
     *             length of 30 characters.
     * @throws NullPointerException
     *             If the given script name is {@code null}.
     */
    D withScriptName(String scriptName);
}
