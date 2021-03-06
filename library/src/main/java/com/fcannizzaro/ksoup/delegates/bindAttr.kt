package com.fcannizzaro.ksoup.delegates

import com.fcannizzaro.ksoup.IKsoup
import com.fcannizzaro.ksoup.KAttr
import com.fcannizzaro.ksoup.util.extractAttr
import kotlin.reflect.KProperty

/**
 * Created by Francesco Cannizzaro (fcannizzaro).
 */

class bindAttr(private var query: String, private val attr: String, private val trim: Boolean = true) {

    constructor(query: String, attr: KAttr, trim: Boolean = true) : this(query, attr.attr, trim)

    operator fun getValue(ref: IKsoup, property: KProperty<*>): String? = extractAttr(ref.element, query, attr, trim)

}