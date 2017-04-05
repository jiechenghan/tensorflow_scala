/* DO NOT EDIT THIS FILE - it is machine generated */
#include <jni.h>
/* Header for class org_platanios_tensorflow_jni_Operation__ */

#ifndef _Included_org_platanios_tensorflow_jni_Operation__
#define _Included_org_platanios_tensorflow_jni_Operation__
#ifdef __cplusplus
extern "C" {
#endif

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    name
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_name
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    opType
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_opType
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    device
 * Signature: (J)Ljava/lang/String;
 */
JNIEXPORT jstring JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_device
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    numOutputs
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_numOutputs
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    outputDataType
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_outputDataType
  (JNIEnv *, jobject, jlong, jlong, jint);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    numInputs
 * Signature: (J)I
 */
JNIEXPORT jint JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_numInputs
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    inputDataType
 * Signature: (JJI)I
 */
JNIEXPORT jint JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_inputDataType
  (JNIEnv *, jobject, jlong, jlong, jint);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    shape
 * Signature: (JJI)[J
 */
JNIEXPORT jlongArray JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_shape
  (JNIEnv *, jobject, jlong, jlong, jint);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    listAll
 * Signature: ()[B
 */
JNIEXPORT jbyteArray JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_allOps
  (JNIEnv *, jobject);
  
/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    allocate
 * Signature: (JLjava/lang/String;Ljava/lang/String;)J
 */
JNIEXPORT jlong JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_allocate
  (JNIEnv *, jobject, jlong, jstring, jstring);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    finish
 * Signature: (J)J
 */
JNIEXPORT jlong JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_finish
  (JNIEnv *, jobject, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    addInput
 * Signature: (JJI)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_addInput
  (JNIEnv *, jobject, jlong, jlong, jint);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    addInputList
 * Signature: (J[J[I)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_addInputList
  (JNIEnv *, jobject, jlong, jlongArray, jintArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    addControlInput
 * Signature: (JJ)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_addControlInput
  (JNIEnv *, jobject, jlong, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setDevice
 * Signature: (JLjava/lang/String;)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setDevice
  (JNIEnv *, jobject, jlong, jstring);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrString
 * Signature: (JLjava/lang/String;[B)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrString
  (JNIEnv *, jobject, jlong, jstring, jbyteArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrInt
 * Signature: (JLjava/lang/String;J)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrInt
  (JNIEnv *, jobject, jlong, jstring, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrIntList
 * Signature: (JLjava/lang/String;[J)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrIntList
  (JNIEnv *, jobject, jlong, jstring, jlongArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrFloat
 * Signature: (JLjava/lang/String;F)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrFloat
  (JNIEnv *, jobject, jlong, jstring, jfloat);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrFloatList
 * Signature: (JLjava/lang/String;[F)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrFloatList
  (JNIEnv *, jobject, jlong, jstring, jfloatArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrBool
 * Signature: (JLjava/lang/String;Z)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrBool
  (JNIEnv *, jobject, jlong, jstring, jboolean);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrBoolList
 * Signature: (JLjava/lang/String;[Z)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrBoolList
  (JNIEnv *, jobject, jlong, jstring, jbooleanArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrType
 * Signature: (JLjava/lang/String;I)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrType
  (JNIEnv *, jobject, jlong, jstring, jint);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrTypeList
 * Signature: (JLjava/lang/String;[I)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrTypeList
  (JNIEnv *, jobject, jlong, jstring, jintArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrTensor
 * Signature: (JLjava/lang/String;J)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrTensor
  (JNIEnv *, jobject, jlong, jstring, jlong);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrTensorList
 * Signature: (JLjava/lang/String;[J)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrTensorList
  (JNIEnv *, jobject, jlong, jstring, jlongArray);

/*
 * Class:     org_platanios_tensorflow_jni_Operation__
 * Method:    setAttrShape
 * Signature: (JLjava/lang/String;[JI)V
 */
JNIEXPORT void JNICALL Java_org_platanios_tensorflow_jni_Operation_00024_setAttrShape
  (JNIEnv *, jobject, jlong, jstring, jlongArray, jint);

#ifdef __cplusplus
}
#endif
#endif
