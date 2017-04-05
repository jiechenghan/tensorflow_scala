package org.platanios.tensorflow.api.ops

import org.platanios.tensorflow.api.DataType

import scala.util.DynamicVariable

/**
  * @author Emmanouil Antonios Platanios
  */
object MathOps {
  def addN(inputs: Array[Op.Output], name: String = "AddN")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "AddN", name = name)
        .addInputs(inputs)
        .build().output(index = 0)

  def matMul(
      a: Op.Output, b: Op.Output, transposeA: Boolean = false, transposeB: Boolean = false, name: String = "MatMul")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output = {
    Op.opBuildHelper(context = context, opType = "MatMul", name = name, a, b)
        .setAttribute(name = "transpose_a", value = transposeA)
        .setAttribute(name = "transpose_b", value = transposeB)
        .build().output(index = 0)
  }

  def batchMatMul(
      x: Op.Output, y: Op.Output, adjointX: Boolean = false, adjointY: Boolean = false, name: String = "BatchMatMul")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "BatchMatMul", name = name, x, y)
        .setAttribute(name = "adj_x", value = adjointX)
        .setAttribute(name = "adj_y", value = adjointY)
        .build().output(index = 0)

  def cast(x: Op.Output, dataType: DataType[_], name: String = "Cast")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Cast", name = name, x)
        .setAttribute(name = "DstT", value = dataType)
        .build().output(index = 0)

  //region Unary Ops

  def abs(x: Op.Output, name: String = "Abs")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Abs", name = name, x).build().output(index = 0)

  def complexAbs(x: Op.Output, name: String = "ComplexAbs")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "ComplexAbs", name = name, x).build().output(index = 0)

  def reciprocal(x: Op.Output, name: String = "Reciprocal")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Reciprocal", name = name, x).build().output(index = 0)

  def square(x: Op.Output, name: String = "Square")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Square", name = name, x).build().output(index = 0)

  def sqrt(x: Op.Output, name: String = "Sqrt")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Sqrt", name = name, x).build().output(index = 0)

  def reciprocalSqrt(x: Op.Output, name: String = "Rsqrt")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Rsqrt", name = name, x).build().output(index = 0)

  def round(x: Op.Output, name: String = "Round")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Round", name = name, x).build().output(index = 0)

  def exp(x: Op.Output, name: String = "Exp")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Exp", name = name, x).build().output(index = 0)

  def expMinus1(x: Op.Output, name: String = "Expm1")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Expm1", name = name, x).build().output(index = 0)

  def log(x: Op.Output, name: String = "Log")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Log", name = name, x).build().output(index = 0)

  def log1Plus(x: Op.Output, name: String = "Log1p")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Log1p", name = name, x).build().output(index = 0)

  def tanh(x: Op.Output, name: String = "Tanh")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Tanh", name = name, x).build().output(index = 0)

  def logGamma(x: Op.Output, name: String = "Lgamma")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Lgamma", name = name, x).build().output(index = 0)

  def digamma(x: Op.Output, name: String = "Digamma")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Digamma", name = name, x).build().output(index = 0)

  def erf(x: Op.Output, name: String = "Erf")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Erf", name = name, x).build().output(index = 0)

  def complementaryErf(x: Op.Output, name: String = "Erfc")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Erfc", name = name, x).build().output(index = 0)

  def sigmoid(x: Op.Output, name: String = "Sigmoid")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Sigmoid", name = name, x).build().output(index = 0)

  def sin(x: Op.Output, name: String = "Sin")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Sin", name = name, x).build().output(index = 0)

  def cos(x: Op.Output, name: String = "Cos")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Cos", name = name, x).build().output(index = 0)

  def tan(x: Op.Output, name: String = "Tan")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Tan", name = name, x).build().output(index = 0)

  def asin(x: Op.Output, name: String = "Asin")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Asin", name = name, x).build().output(index = 0)

  def acos(x: Op.Output, name: String = "Acos")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Acos", name = name, x).build().output(index = 0)

  def atan(x: Op.Output, name: String = "Atan")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Atan", name = name, x).build().output(index = 0)

  def isNaN(x: Op.Output, name: String = "IsNan")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "IsNan", name = name, x).build().output(index = 0)

  def isInf(x: Op.Output, name: String = "IsInf")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "IsInf", name = name, x).build().output(index = 0)

  def isFinite(x: Op.Output, name: String = "IsFinite")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "IsFinite", name = name, x).build().output(index = 0)

  def sign(x: Op.Output, name: String = "Sign")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Sign", name = name, x).build().output(index = 0)

  def floor(x: Op.Output, name: String = "Floor")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Floor", name = name, x).build().output(index = 0)

  def ceil(x: Op.Output, name: String = "Ceil")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Ceil", name = name, x).build().output(index = 0)

  def roundInt(x: Op.Output, name: String = "Rint")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Rint", name = name, x).build().output(index = 0)

  //endregion Unary Ops

  //region Binary Ops

  def add(x: Op.Output, y: Op.Output, name: String = "Add")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Add", name = name, x, y).build().output(index = 0)

  def subtract(x: Op.Output, y: Op.Output, name: String = "Sub")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Sub", name = name, x, y).build().output(index = 0)

  def multiply(x: Op.Output, y: Op.Output, name: String = "Mul")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Mul", name = name, x, y).build().output(index = 0)

  def divide(x: Op.Output, y: Op.Output, name: String = "Div")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Div", name = name, x, y).build().output(index = 0)

  def floorDivide(x: Op.Output, y: Op.Output, name: String = "FloorDiv")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "FloorDiv", name = name, x, y).build().output(index = 0)

  def truncateDivide(x: Op.Output, y: Op.Output, name: String = "TruncateDiv")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "TruncateDiv", name = name, x, y).build().output(index = 0)

  def realDivide(x: Op.Output, y: Op.Output, name: String = "RealDiv")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "RealDiv", name = name, x, y).build().output(index = 0)

  def squaredDifference(x: Op.Output, y: Op.Output, name: String = "SquaredDifference")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "SquaredDifference", name = name, x, y).build().output(index = 0)

  def maximum(x: Op.Output, y: Op.Output, name: String = "Maximum")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Maximum", name = name, x, y).build().output(index = 0)

  def minimum(x: Op.Output, y: Op.Output, name: String = "Minimum")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Minimum", name = name, x, y).build().output(index = 0)

  def mod(x: Op.Output, y: Op.Output, name: String = "Mod")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Mod", name = name, x, y).build().output(index = 0)

  def floorMod(x: Op.Output, y: Op.Output, name: String = "FloorMod")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "FloorMod", name = name, x, y).build().output(index = 0)

  def truncateMod(x: Op.Output, y: Op.Output, name: String = "TruncateMod")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "TruncateMod", name = name, x, y).build().output(index = 0)

  def pow(x: Op.Output, y: Op.Output, name: String = "Pow")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Pow", name = name, x, y).build().output(index = 0)

  def igammac(a: Op.Output, x: Op.Output, name: String = "Igammac")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Igammac", name = name, a, x).build().output(index = 0)

  def igamma(a: Op.Output, x: Op.Output, name: String = "Igamma")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Igamma", name = name, a, x).build().output(index = 0)

  def zeta(x: Op.Output, q: Op.Output, name: String = "Zeta")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Zeta", name = name, x, q).build().output(index = 0)

  def polygamma(a: Op.Output, x: Op.Output, name: String = "Polygamma")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Polygamma", name = name, a, x).build().output(index = 0)

  //endregion Binary Ops

  def betainc(a: Op.Output, b: Op.Output, x: Op.Output, name: String = "Betainc")
      (implicit context: DynamicVariable[OpCreationContext]): Op.Output =
    Op.opBuildHelper(context = context, opType = "Betainc", name = name, a, b, x).build().output(index = 0)
}
