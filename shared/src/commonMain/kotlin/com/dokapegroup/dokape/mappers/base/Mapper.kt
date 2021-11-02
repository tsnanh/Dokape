package com.dokapegroup.dokape.mappers.base

interface Mapper<I, O> : (I) -> O {
    override fun invoke(input: I): O
}
