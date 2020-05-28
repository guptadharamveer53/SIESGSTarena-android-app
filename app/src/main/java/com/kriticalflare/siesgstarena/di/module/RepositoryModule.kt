package com.kriticalflare.siesgstarena.di.module

import com.kriticalflare.siesgstarena.blogs.repository.BlogsRepository
import com.kriticalflare.siesgstarena.contests.repository.ContestsRepository
import com.kriticalflare.siesgstarena.problemset.repository.ProblemsRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory {
        ContestsRepository(get(), get())
    }
    factory {
        ProblemsRepository(get(), get())
    }
    factory {
        BlogsRepository(get(), get())
    }
}
