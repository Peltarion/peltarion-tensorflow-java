// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;

@Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class Listener_String extends FunctionPointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public    Listener_String(Pointer p) { super(p); }
    protected Listener_String() { allocate(); }
    private native void allocate();
    public native void call(String arg0);
}
