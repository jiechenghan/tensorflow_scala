package org.platanios.tensorflow.jni

import ch.jodersky.jni.nativeLoader

/**
  * @author Emmanouil Antonios Platanios
  */
@nativeLoader("tensorflow_jni")
object Operation {
  // Operation
  @native def name(handle: Long): String
  @native def opName(handle: Long): String
  @native def numOutputs(handle: Long): Int
  @native def dataType(graphHandle: Long, opHandle: Long, output: Int): Int
  @native def shape(graphHandle: Long, opHandle: Long, output: Int): Array[Long]
  @native def allOps: Array[Byte]

  // Operation Builder
  @native def allocate(graphHandle: Long, opType: String, name: String): Long
  @native def finish(handle: Long): Long
  @native def addInput(handle: Long, operationHandle: Long, index: Int): Unit
  @native def addInputList(handle: Long, operationHandles: Array[Long], indices: Array[Int]): Unit
  @native def addControlInput(handle: Long, inputOpHandle: Long): Unit
  @native def setDevice(handle: Long, device: String): Unit

  // The names of all the setAttr* family functions below correspond to the C library types, not the
  // Java library types. Roughly, setAttrFoo calls the TensorFlow C library function: TF_SetAttrFoo.
  //
  // TODO(ashankar):
  // - setAttrStringList: Which would take in an array of byte[] (java Strings will need to be UTF-8
  //   encoded?)
  // - setAttrShapeList: Which would take in a long[][]
  @native def setAttrString(handle: Long, name: String, value: Array[Byte]): Unit
  @native def setAttrInt(handle: Long, name: String, value: Long): Unit
  @native def setAttrIntList(handle: Long, name: String, value: Array[Long]): Unit
  @native def setAttrFloat(handle: Long, name: String, value: Float): Unit
  @native def setAttrFloatList(handle: Long, name: String, value: Array[Float]): Unit
  @native def setAttrBool(handle: Long, name: String, value: Boolean): Unit
  @native def setAttrBoolList(handle: Long, name: String, value: Array[Boolean]): Unit
  @native def setAttrType(handle: Long, name: String, dataType: Int): Unit
  @native def setAttrTypeList(handle: Long, name: String, dataType: Array[Int]): Unit
  @native def setAttrTensor(handle: Long, name: String, tensorHandle: Long): Unit
  @native def setAttrTensorList(handle: Long, name: String, tensorHandle: Array[Long]): Unit
  @native def setAttrShape(handle: Long, name: String, shape: Array[Long], numDims: Int): Unit
}