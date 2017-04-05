package org.platanios.tensorflow

import scala.util.DynamicVariable

/**
  * @author Emmanouil Antonios Platanios
  */
package object api {
  val DataType = org.platanios.tensorflow.jni.DataType
  type DataType[T] = org.platanios.tensorflow.jni.DataType[T]

  trait Closeable {
    def close(): Unit
  }

  def using[T <: Closeable, R](resource: T)(block: T => R): R = {
    try {
      block(resource)
    } finally {
      if (resource != null)
        resource.close()
    }
  }

  import org.platanios.tensorflow.api.ops.OpCreationContext

  val defaultGraph: Graph = Graph()
  implicit val opCreationContext: DynamicVariable[OpCreationContext] =
    new DynamicVariable[OpCreationContext](OpCreationContext(graph = defaultGraph))

  implicit def dynamicVariableToOpCreationContext(context: DynamicVariable[OpCreationContext]): OpCreationContext =
    context.value
}
