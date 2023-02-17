package com.jk.mvp_hw1

class Presenter {
    private val model = Injector.getModel()
    private lateinit var view: CounterView
    fun increment() {
        model.increment()
        view.changeCount(model.count)
        if (model.count == 10) {
            view.showToast()
        } else if (model.count == 15) {
            view.setColor()
        }
    }

    fun decrement() {
        model.decrement()
        view.changeCount(model.count)
    }

    fun attachView(view: CounterView) {
        this.view = view

    }
}