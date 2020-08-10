// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: tensorflow/core/protobuf/struct.proto

package org.tensorflow.proto.framework;

public final class StructProtos {
  private StructProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_StructuredValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_StructuredValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NoneValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NoneValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_ListValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_ListValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TupleValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TupleValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DictValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DictValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_DictValue_FieldsEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_DictValue_FieldsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_PairValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_PairValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_NamedTupleValue_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_NamedTupleValue_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TensorSpecProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TensorSpecProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_BoundedTensorSpecProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_BoundedTensorSpecProto_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tensorflow_TypeSpecProto_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tensorflow_TypeSpecProto_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n%tensorflow/core/protobuf/struct.proto\022" +
      "\ntensorflow\032&tensorflow/core/framework/t" +
      "ensor.proto\032,tensorflow/core/framework/t" +
      "ensor_shape.proto\032%tensorflow/core/frame" +
      "work/types.proto\"\220\005\n\017StructuredValue\022+\n\n" +
      "none_value\030\001 \001(\0132\025.tensorflow.NoneValueH" +
      "\000\022\027\n\rfloat64_value\030\013 \001(\001H\000\022\025\n\013int64_valu" +
      "e\030\014 \001(\022H\000\022\026\n\014string_value\030\r \001(\tH\000\022\024\n\nboo" +
      "l_value\030\016 \001(\010H\000\022:\n\022tensor_shape_value\030\037 " +
      "\001(\0132\034.tensorflow.TensorShapeProtoH\000\0222\n\022t" +
      "ensor_dtype_value\030  \001(\0162\024.tensorflow.Dat" +
      "aTypeH\000\0228\n\021tensor_spec_value\030! \001(\0132\033.ten" +
      "sorflow.TensorSpecProtoH\000\0224\n\017type_spec_v" +
      "alue\030\" \001(\0132\031.tensorflow.TypeSpecProtoH\000\022" +
      "G\n\031bounded_tensor_spec_value\030# \001(\0132\".ten" +
      "sorflow.BoundedTensorSpecProtoH\000\022+\n\nlist" +
      "_value\0303 \001(\0132\025.tensorflow.ListValueH\000\022-\n" +
      "\013tuple_value\0304 \001(\0132\026.tensorflow.TupleVal" +
      "ueH\000\022+\n\ndict_value\0305 \001(\0132\025.tensorflow.Di" +
      "ctValueH\000\0228\n\021named_tuple_value\0306 \001(\0132\033.t" +
      "ensorflow.NamedTupleValueH\000B\006\n\004kind\"\013\n\tN" +
      "oneValue\"8\n\tListValue\022+\n\006values\030\001 \003(\0132\033." +
      "tensorflow.StructuredValue\"9\n\nTupleValue" +
      "\022+\n\006values\030\001 \003(\0132\033.tensorflow.Structured" +
      "Value\"\212\001\n\tDictValue\0221\n\006fields\030\001 \003(\0132!.te" +
      "nsorflow.DictValue.FieldsEntry\032J\n\013Fields" +
      "Entry\022\013\n\003key\030\001 \001(\t\022*\n\005value\030\002 \001(\0132\033.tens" +
      "orflow.StructuredValue:\0028\001\"D\n\tPairValue\022" +
      "\013\n\003key\030\001 \001(\t\022*\n\005value\030\002 \001(\0132\033.tensorflow" +
      ".StructuredValue\"F\n\017NamedTupleValue\022\014\n\004n" +
      "ame\030\001 \001(\t\022%\n\006values\030\002 \003(\0132\025.tensorflow.P" +
      "airValue\"q\n\017TensorSpecProto\022\014\n\004name\030\001 \001(" +
      "\t\022+\n\005shape\030\002 \001(\0132\034.tensorflow.TensorShap" +
      "eProto\022#\n\005dtype\030\003 \001(\0162\024.tensorflow.DataT" +
      "ype\"\314\001\n\026BoundedTensorSpecProto\022\014\n\004name\030\001" +
      " \001(\t\022+\n\005shape\030\002 \001(\0132\034.tensorflow.TensorS" +
      "hapeProto\022#\n\005dtype\030\003 \001(\0162\024.tensorflow.Da" +
      "taType\022(\n\007minimum\030\004 \001(\0132\027.tensorflow.Ten" +
      "sorProto\022(\n\007maximum\030\005 \001(\0132\027.tensorflow.T" +
      "ensorProto\"\242\003\n\rTypeSpecProto\022@\n\017type_spe" +
      "c_class\030\001 \001(\0162\'.tensorflow.TypeSpecProto" +
      ".TypeSpecClass\022/\n\ntype_state\030\002 \001(\0132\033.ten" +
      "sorflow.StructuredValue\022\034\n\024type_spec_cla" +
      "ss_name\030\003 \001(\t\"\377\001\n\rTypeSpecClass\022\013\n\007UNKNO" +
      "WN\020\000\022\026\n\022SPARSE_TENSOR_SPEC\020\001\022\027\n\023INDEXED_" +
      "SLICES_SPEC\020\002\022\026\n\022RAGGED_TENSOR_SPEC\020\003\022\025\n" +
      "\021TENSOR_ARRAY_SPEC\020\004\022\025\n\021DATA_DATASET_SPE" +
      "C\020\005\022\026\n\022DATA_ITERATOR_SPEC\020\006\022\021\n\rOPTIONAL_" +
      "SPEC\020\007\022\024\n\020PER_REPLICA_SPEC\020\010\022\021\n\rVARIABLE" +
      "_SPEC\020\t\022\026\n\022ROW_PARTITION_SPEC\020\nBz\n\036org.t" +
      "ensorflow.proto.frameworkB\014StructProtosP" +
      "\001ZHgithub.com/tensorflow/tensorflow/tens" +
      "orflow/go/core/core_protos_go_protob\006pro" +
      "to3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.tensorflow.proto.framework.TensorProtos.getDescriptor(),
          org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor(),
          org.tensorflow.proto.framework.TypesProtos.getDescriptor(),
        });
    internal_static_tensorflow_StructuredValue_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tensorflow_StructuredValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_StructuredValue_descriptor,
        new java.lang.String[] { "NoneValue", "Float64Value", "Int64Value", "StringValue", "BoolValue", "TensorShapeValue", "TensorDtypeValue", "TensorSpecValue", "TypeSpecValue", "BoundedTensorSpecValue", "ListValue", "TupleValue", "DictValue", "NamedTupleValue", "Kind", });
    internal_static_tensorflow_NoneValue_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tensorflow_NoneValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NoneValue_descriptor,
        new java.lang.String[] { });
    internal_static_tensorflow_ListValue_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_tensorflow_ListValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_ListValue_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_tensorflow_TupleValue_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_tensorflow_TupleValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TupleValue_descriptor,
        new java.lang.String[] { "Values", });
    internal_static_tensorflow_DictValue_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_tensorflow_DictValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DictValue_descriptor,
        new java.lang.String[] { "Fields", });
    internal_static_tensorflow_DictValue_FieldsEntry_descriptor =
      internal_static_tensorflow_DictValue_descriptor.getNestedTypes().get(0);
    internal_static_tensorflow_DictValue_FieldsEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_DictValue_FieldsEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_PairValue_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_tensorflow_PairValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_PairValue_descriptor,
        new java.lang.String[] { "Key", "Value", });
    internal_static_tensorflow_NamedTupleValue_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_tensorflow_NamedTupleValue_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_NamedTupleValue_descriptor,
        new java.lang.String[] { "Name", "Values", });
    internal_static_tensorflow_TensorSpecProto_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_tensorflow_TensorSpecProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TensorSpecProto_descriptor,
        new java.lang.String[] { "Name", "Shape", "Dtype", });
    internal_static_tensorflow_BoundedTensorSpecProto_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_tensorflow_BoundedTensorSpecProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_BoundedTensorSpecProto_descriptor,
        new java.lang.String[] { "Name", "Shape", "Dtype", "Minimum", "Maximum", });
    internal_static_tensorflow_TypeSpecProto_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_tensorflow_TypeSpecProto_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tensorflow_TypeSpecProto_descriptor,
        new java.lang.String[] { "TypeSpecClass", "TypeState", "TypeSpecClassName", });
    org.tensorflow.proto.framework.TensorProtos.getDescriptor();
    org.tensorflow.proto.framework.TensorShapeProtos.getDescriptor();
    org.tensorflow.proto.framework.TypesProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
