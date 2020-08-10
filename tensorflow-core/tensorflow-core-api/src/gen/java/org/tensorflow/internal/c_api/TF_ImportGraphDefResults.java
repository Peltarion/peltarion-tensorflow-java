// Targeted by JavaCPP version 1.5.4-SNAPSHOT: DO NOT EDIT THIS FILE

package org.tensorflow.internal.c_api;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

import static org.tensorflow.internal.c_api.global.tensorflow.*;


// TF_ImportGraphDefResults holds results that are generated by
// TF_GraphImportGraphDefWithResults().
@Opaque @Properties(inherit = org.tensorflow.internal.c_api.presets.tensorflow.class)
public class TF_ImportGraphDefResults extends Pointer {
    /** Empty constructor. Calls {@code super((Pointer)null)}. */
    public TF_ImportGraphDefResults() { super((Pointer)null); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public TF_ImportGraphDefResults(Pointer p) { super(p); }
}
