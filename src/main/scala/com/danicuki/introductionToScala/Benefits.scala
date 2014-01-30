package com.danicuki.introductiontoscala

object Benefits {

  def FunctionalProgrammingBenefits =
    Seq(LessCode,
      Immutability,
      PatternMatching,
      HigherOrderAndFirstClassFunctions,
      ConcurrencyAndDistribution)

  def ScalaBenefits =
    Seq(FunctionalProgrammingBenefits,
      Traits,
      ScalaPlusJava,
      TypeInference,
      Actors)

}