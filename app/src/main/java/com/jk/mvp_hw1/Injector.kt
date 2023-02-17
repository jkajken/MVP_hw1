package com.jk.mvp_hw1


class Injector {
    companion object {
        fun getPresenter(): Presenter {
            return Presenter()
        }

        fun getModel(): CounterModel {
            return CounterModel()
        }
    }
}