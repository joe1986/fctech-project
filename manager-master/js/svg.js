/**
 * Created by joe on 15/6/18.
 */
/*! svg.js v2.0.0 MIT*/
;
!function (t, e) {
    "function" == typeof define && define.amd ? define(e) : "object" == typeof exports ? module.exports = e(require, exports, module) : t.SVG = e()
}(this, function () {
    function t(t) {
        return t.toLowerCase().replace(/-(.)/g, function (t, e) {
            return e.toUpperCase()
        })
    }

    function e(t) {
        return t.charAt(0).toUpperCase() + t.slice(1)
    }

    function i(t) {
        return 4 == t.length ? ["#", t.substring(1, 2), t.substring(1, 2), t.substring(2, 3), t.substring(2, 3), t.substring(3, 4), t.substring(3, 4)].join("") : t
    }

    function n(t) {
        var e = t.toString(16);
        return 1 == e.length ? "0" + e : e
    }

    function r(t, e, i) {
        return null == i ? i = t.height / t.width * e : null == e && (e = t.width / t.height * i), {width: e, height: i}
    }

    function s(t, e, i) {
        return {x: e * t.a + i * t.c + 0, y: e * t.b + i * t.d + 0}
    }

    function o(t) {
        return {a: t[0], b: t[1], c: t[2], d: t[3], e: t[4], f: t[5]}
    }

    function a(t) {
        return t instanceof m.Matrix || (t = new m.Matrix(t)), t
    }

    function h(t, e) {
        t.cx = null == t.cx ? e.bbox().cx : t.cx, t.cy = null == t.cy ? e.bbox().cy : t.cy
    }

    function u(t) {
        return t = t.replace(m.regex.whitespace, "").replace(m.regex.matrix, "").split(","), o(m.utils.map(t, function (t) {
            return parseFloat(t)
        }))
    }

    function l(t, e) {
        return "number" == typeof t.from ? t.from + (t.to - t.from) * e : t instanceof m.Color || t instanceof m.Number || t instanceof m.Matrix ? t.at(e) : 1 > e ? t.from : t.to
    }

    function c(t) {
        for (var e = 0, i = t.length, n = ""; i > e; e++)n += t[e][0], null != t[e][1] && (n += t[e][1], null != t[e][2] && (n += " ", n += t[e][2], null != t[e][3] && (n += " ", n += t[e][3], n += " ", n += t[e][4], null != t[e][5] && (n += " ", n += t[e][5], n += " ", n += t[e][6], null != t[e][7] && (n += " ", n += t[e][7])))));
        return n + " "
    }

    function f(t) {
        for (var e = t.childNodes.length - 1; e >= 0; e--)t.childNodes[e]instanceof SVGElement && f(t.childNodes[e]);
        return m.adopt(t).id(m.eid(t.nodeName))
    }

    function d(t) {
        return null == t.x && (t.x = 0, t.y = 0, t.width = 0, t.height = 0), t.w = t.width, t.h = t.height, t.x2 = t.x + t.width, t.y2 = t.y + t.height, t.cx = t.x + t.width / 2, t.cy = t.y + t.height / 2, t
    }

    function p(t) {
        var e = t.toString().match(m.regex.reference);
        return e ? e[1] : void 0
    }

    var m = this.SVG = function (t) {
        return m.supported ? (t = new m.Doc(t), m.parser || m.prepare(t), t) : void 0
    };
    if (m.ns = "http://www.w3.org/2000/svg", m.xmlns = "http://www.w3.org/2000/xmlns/", m.xlink = "http://www.w3.org/1999/xlink", m.supported = function () {
            return !!document.createElementNS && !!document.createElementNS(m.ns, "svg").createSVGRect
        }(), !m.supported)return !1;
    m.did = 1e3, m.eid = function (t) {
        return "Svgjs" + e(t) + m.did++
    }, m.create = function (t) {
        var e = document.createElementNS(this.ns, t);
        return e.setAttribute("id", this.eid(t)), e
    }, m.extend = function () {
        var t, e, i, n;
        for (t = [].slice.call(arguments), e = t.pop(), n = t.length - 1; n >= 0; n--)if (t[n])for (i in e)t[n].prototype[i] = e[i];
        m.Set && m.Set.inherit && m.Set.inherit()
    }, m.invent = function (t) {
        var e = "function" == typeof t.create ? t.create : function () {
            this.constructor.call(this, m.create(t.create))
        };
        return t.inherit && (e.prototype = new t.inherit), t.extend && m.extend(e, t.extend), t.construct && m.extend(t.parent || m.Container, t.construct), e
    }, m.adopt = function (t) {
        if (t.instance)return t.instance;
        var i;
        return i = "svg" == t.nodeName ? t.parentNode instanceof SVGElement ? new m.Nested : new m.Doc : "lineairGradient" == t.nodeName ? new m.Gradient("lineair") : "radialGradient" == t.nodeName ? new m.Gradient("radial") : m[e(t.nodeName)] ? new (m[e(t.nodeName)]) : new m.Element(t), i.type = t.nodeName, i.node = t, t.instance = i, i instanceof m.Doc && i.namespace().defs(), i
    }, m.prepare = function (t) {
        var e = document.getElementsByTagName("body")[0], i = (e ? new m.Doc(e) : t.nested()).size(2, 0), n = m.create("path");
        i.node.appendChild(n), m.parser = {
            body: e || t.parent(),
            draw: i.style("opacity:0;position:fixed;left:100%;top:100%;overflow:hidden"),
            poly: i.polyline().node,
            path: n
        }
    }, m.regex = {
        unit: /^(-?[\d\.]+)([a-z%]{0,2})$/,
        hex: /^#?([a-f\d]{2})([a-f\d]{2})([a-f\d]{2})$/i,
        rgb: /rgb\((\d+),(\d+),(\d+)\)/,
        reference: /#([a-z0-9\-_]+)/i,
        matrix: /matrix\(|\)/g,
        whitespace: /\s/g,
        isHex: /^#[a-f0-9]{3,6}$/i,
        isRgb: /^rgb\(/,
        isCss: /[^:]+:[^;]+;?/,
        isBlank: /^(\s+)?$/,
        isNumber: /^-?[\d\.]+$/,
        isPercent: /^-?[\d\.]+%$/,
        isImage: /\.(jpg|jpeg|png|gif|svg)(\?[^=]+.*)?/i
    }, m.utils = {
        map: function (t, e) {
            var i, n = t.length, r = [];
            for (i = 0; n > i; i++)r.push(e(t[i]));
            return r
        }, radians: function (t) {
            return t % 360 * Math.PI / 180
        }, degrees: function (t) {
            return 180 * t / Math.PI % 360
        }
    }, m.defaults = {
        attrs: {
            "fill-opacity": 1,
            "stroke-opacity": 1,
            "stroke-width": 0,
            "stroke-linejoin": "miter",
            "stroke-linecap": "butt",
            fill: "#000000",
            stroke: "#000000",
            opacity: 1,
            x: 0,
            y: 0,
            cx: 0,
            cy: 0,
            width: 0,
            height: 0,
            r: 0,
            rx: 0,
            ry: 0,
            offset: 0,
            "stop-opacity": 1,
            "stop-color": "#000000",
            "font-size": 16,
            "font-family": "Helvetica, Arial, sans-serif",
            "text-anchor": "start"
        }
    }, m.Color = function (t) {
        var e;
        this.r = 0, this.g = 0, this.b = 0, "string" == typeof t ? m.regex.isRgb.test(t) ? (e = m.regex.rgb.exec(t.replace(/\s/g, "")), this.r = parseInt(e[1]), this.g = parseInt(e[2]), this.b = parseInt(e[3])) : m.regex.isHex.test(t) && (e = m.regex.hex.exec(i(t)), this.r = parseInt(e[1], 16), this.g = parseInt(e[2], 16), this.b = parseInt(e[3], 16)) : "object" == typeof t && (this.r = t.r, this.g = t.g, this.b = t.b)
    }, m.extend(m.Color, {
        toString: function () {
            return this.toHex()
        }, toHex: function () {
            return "#" + n(this.r) + n(this.g) + n(this.b)
        }, toRgb: function () {
            return "rgb(" + [this.r, this.g, this.b].join() + ")"
        }, brightness: function () {
            return this.r / 255 * .3 + this.g / 255 * .59 + this.b / 255 * .11
        }, morph: function (t) {
            return this.destination = new m.Color(t), this
        }, at: function (t) {
            return this.destination ? (t = 0 > t ? 0 : t > 1 ? 1 : t, new m.Color({
                r: ~~(this.r + (this.destination.r - this.r) * t),
                g: ~~(this.g + (this.destination.g - this.g) * t),
                b: ~~(this.b + (this.destination.b - this.b) * t)
            })) : this
        }
    }), m.Color.test = function (t) {
        return t += "", m.regex.isHex.test(t) || m.regex.isRgb.test(t)
    }, m.Color.isRgb = function (t) {
        return t && "number" == typeof t.r && "number" == typeof t.g && "number" == typeof t.b
    }, m.Color.isColor = function (t) {
        return m.Color.isRgb(t) || m.Color.test(t)
    }, m.Array = function (t, e) {
        t = (t || []).valueOf(), 0 == t.length && e && (t = e.valueOf()), this.value = this.parse(t)
    }, m.extend(m.Array, {
        morph: function (t) {
            if (this.destination = this.parse(t), this.value.length != this.destination.length) {
                for (var e = this.value[this.value.length - 1], i = this.destination[this.destination.length - 1]; this.value.length > this.destination.length;)this.destination.push(i);
                for (; this.value.length < this.destination.length;)this.value.push(e)
            }
            return this
        }, settle: function () {
            for (var t = 0, e = this.value.length, i = []; e > t; t++)-1 == i.indexOf(this.value[t]) && i.push(this.value[t]);
            return this.value = i
        }, at: function (t) {
            if (!this.destination)return this;
            for (var e = 0, i = this.value.length, n = []; i > e; e++)n.push(this.value[e] + (this.destination[e] - this.value[e]) * t);
            return new m.Array(n)
        }, toString: function () {
            return this.value.join(" ")
        }, valueOf: function () {
            return this.value
        }, parse: function (t) {
            return t = t.valueOf(), Array.isArray(t) ? t : this.split(t)
        }, split: function (t) {
            return t.trim().split(/\s+/)
        }, reverse: function () {
            return this.value.reverse(), this
        }
    }), m.PointArray = function (t, e) {
        this.constructor.call(this, t, e || [[0, 0]])
    }, m.PointArray.prototype = new m.Array, m.extend(m.PointArray, {
        toString: function () {
            for (var t = 0, e = this.value.length, i = []; e > t; t++)i.push(this.value[t].join(","));
            return i.join(" ")
        }, toLine: function () {
            return {x1: this.value[0][0], y1: this.value[0][1], x2: this.value[1][0], y2: this.value[1][1]}
        }, at: function (t) {
            if (!this.destination)return this;
            for (var e = 0, i = this.value.length, n = []; i > e; e++)n.push([this.value[e][0] + (this.destination[e][0] - this.value[e][0]) * t, this.value[e][1] + (this.destination[e][1] - this.value[e][1]) * t]);
            return new m.PointArray(n)
        }, parse: function (t) {
            if (t = t.valueOf(), Array.isArray(t))return t;
            t = this.split(t);
            for (var e, i = 0, n = t.length, r = []; n > i; i++)e = t[i].split(","), r.push([parseFloat(e[0]), parseFloat(e[1])]);
            return r
        }, move: function (t, e) {
            var i = this.bbox();
            if (t -= i.x, e -= i.y, !isNaN(t) && !isNaN(e))for (var n = this.value.length - 1; n >= 0; n--)this.value[n] = [this.value[n][0] + t, this.value[n][1] + e];
            return this
        }, size: function (t, e) {
            var i, n = this.bbox();
            for (i = this.value.length - 1; i >= 0; i--)this.value[i][0] = (this.value[i][0] - n.x) * t / n.width + n.x, this.value[i][1] = (this.value[i][1] - n.y) * e / n.height + n.y;
            return this
        }, bbox: function () {
            return m.parser.poly.setAttribute("points", this.toString()), m.parser.poly.getBBox()
        }
    }), m.PathArray = function (t, e) {
        this.constructor.call(this, t, e || [["M", 0, 0]])
    }, m.PathArray.prototype = new m.Array, m.extend(m.PathArray, {
        toString: function () {
            return c(this.value)
        }, move: function (t, e) {
            var i = this.bbox();
            if (t -= i.x, e -= i.y, !isNaN(t) && !isNaN(e))for (var n, r = this.value.length - 1; r >= 0; r--)n = this.value[r][0], "M" == n || "L" == n || "T" == n ? (this.value[r][1] += t, this.value[r][2] += e) : "H" == n ? this.value[r][1] += t : "V" == n ? this.value[r][1] += e : "C" == n || "S" == n || "Q" == n ? (this.value[r][1] += t, this.value[r][2] += e, this.value[r][3] += t, this.value[r][4] += e, "C" == n && (this.value[r][5] += t, this.value[r][6] += e)) : "A" == n && (this.value[r][6] += t, this.value[r][7] += e);
            return this
        }, size: function (t, e) {
            var i, n, r = this.bbox();
            for (i = this.value.length - 1; i >= 0; i--)n = this.value[i][0], "M" == n || "L" == n || "T" == n ? (this.value[i][1] = (this.value[i][1] - r.x) * t / r.width + r.x, this.value[i][2] = (this.value[i][2] - r.y) * e / r.height + r.y) : "H" == n ? this.value[i][1] = (this.value[i][1] - r.x) * t / r.width + r.x : "V" == n ? this.value[i][1] = (this.value[i][1] - r.y) * e / r.height + r.y : "C" == n || "S" == n || "Q" == n ? (this.value[i][1] = (this.value[i][1] - r.x) * t / r.width + r.x, this.value[i][2] = (this.value[i][2] - r.y) * e / r.height + r.y, this.value[i][3] = (this.value[i][3] - r.x) * t / r.width + r.x, this.value[i][4] = (this.value[i][4] - r.y) * e / r.height + r.y, "C" == n && (this.value[i][5] = (this.value[i][5] - r.x) * t / r.width + r.x, this.value[i][6] = (this.value[i][6] - r.y) * e / r.height + r.y)) : "A" == n && (this.value[i][1] = this.value[i][1] * t / r.width, this.value[i][2] = this.value[i][2] * e / r.height, this.value[i][6] = (this.value[i][6] - r.x) * t / r.width + r.x, this.value[i][7] = (this.value[i][7] - r.y) * e / r.height + r.y);
            return this
        }, parse: function (t) {
            if (t instanceof m.PathArray)return t.valueOf();
            var e, i, n, r, s, o, a, h, u, l, f, d = 0, p = 0;
            for (m.parser.path.setAttribute("d", "string" == typeof t ? t : c(t)), f = m.parser.path.pathSegList, e = 0, i = f.numberOfItems; i > e; ++e)l = f.getItem(e), u = l.pathSegTypeAsLetter, "M" == u || "L" == u || "H" == u || "V" == u || "C" == u || "S" == u || "Q" == u || "T" == u || "A" == u ? ("x"in l && (d = l.x), "y"in l && (p = l.y)) : ("x1"in l && (s = d + l.x1), "x2"in l && (a = d + l.x2), "y1"in l && (o = p + l.y1), "y2"in l && (h = p + l.y2), "x"in l && (d += l.x), "y"in l && (p += l.y), "m" == u ? f.replaceItem(m.parser.path.createSVGPathSegMovetoAbs(d, p), e) : "l" == u ? f.replaceItem(m.parser.path.createSVGPathSegLinetoAbs(d, p), e) : "h" == u ? f.replaceItem(m.parser.path.createSVGPathSegLinetoHorizontalAbs(d), e) : "v" == u ? f.replaceItem(m.parser.path.createSVGPathSegLinetoVerticalAbs(p), e) : "c" == u ? f.replaceItem(m.parser.path.createSVGPathSegCurvetoCubicAbs(d, p, s, o, a, h), e) : "s" == u ? f.replaceItem(m.parser.path.createSVGPathSegCurvetoCubicSmoothAbs(d, p, a, h), e) : "q" == u ? f.replaceItem(m.parser.path.createSVGPathSegCurvetoQuadraticAbs(d, p, s, o), e) : "t" == u ? f.replaceItem(m.parser.path.createSVGPathSegCurvetoQuadraticSmoothAbs(d, p), e) : "a" == u ? f.replaceItem(m.parser.path.createSVGPathSegArcAbs(d, p, l.r1, l.r2, l.angle, l.largeArcFlag, l.sweepFlag), e) : ("z" == u || "Z" == u) && (d = n, p = r)), ("M" == u || "m" == u) && (n = d, r = p);
            for (t = [], f = m.parser.path.pathSegList, e = 0, i = f.numberOfItems; i > e; ++e)l = f.getItem(e), u = l.pathSegTypeAsLetter, d = [u], "M" == u || "L" == u || "T" == u ? d.push(l.x, l.y) : "H" == u ? d.push(l.x) : "V" == u ? d.push(l.y) : "C" == u ? d.push(l.x1, l.y1, l.x2, l.y2, l.x, l.y) : "S" == u ? d.push(l.x2, l.y2, l.x, l.y) : "Q" == u ? d.push(l.x1, l.y1, l.x, l.y) : "A" == u && d.push(l.r1, l.r2, l.angle, 0 | l.largeArcFlag, 0 | l.sweepFlag, l.x, l.y), t.push(d);
            return t
        }, bbox: function () {
            return m.parser.path.setAttribute("d", this.toString()), m.parser.path.getBBox()
        }
    }), m.Number = m.invent({
        create: function (t, e) {
            this.value = 0, this.unit = e || "", "number" == typeof t ? this.value = isNaN(t) ? 0 : isFinite(t) ? t : 0 > t ? -3.4e38 : 3.4e38 : "string" == typeof t ? (e = t.match(m.regex.unit), e && (this.value = parseFloat(e[1]), "%" == e[2] ? this.value /= 100 : "s" == e[2] && (this.value *= 1e3), this.unit = e[2])) : t instanceof m.Number && (this.value = t.valueOf(), this.unit = t.unit)
        }, extend: {
            toString: function () {
                return ("%" == this.unit ? ~~(1e8 * this.value) / 1e6 : "s" == this.unit ? this.value / 1e3 : this.value) + this.unit
            }, valueOf: function () {
                return this.value
            }, plus: function (t) {
                return new m.Number(this + new m.Number(t), this.unit)
            }, minus: function (t) {
                return this.plus(-new m.Number(t))
            }, times: function (t) {
                return new m.Number(this * new m.Number(t), this.unit)
            }, divide: function (t) {
                return new m.Number(this / new m.Number(t), this.unit)
            }, to: function (t) {
                var e = new m.Number(this);
                return "string" == typeof t && (e.unit = t), e
            }, morph: function (t) {
                return this.destination = new m.Number(t), this
            }, at: function (t) {
                return this.destination ? new m.Number(this.destination).minus(this).times(t).plus(this) : this
            }
        }
    }), m.ViewBox = function (t) {
        var e, i, n, r, s = 1, o = 1, a = t.bbox(), h = (t.attr("viewBox") || "").match(/-?[\d\.]+/g), u = t, l = t;
        for (n = new m.Number(t.width()), r = new m.Number(t.height()); "%" == n.unit;)s *= n.value, n = new m.Number(u instanceof m.Doc ? u.parent().offsetWidth : u.parent().width()), u = u.parent();
        for (; "%" == r.unit;)o *= r.value, r = new m.Number(l instanceof m.Doc ? l.parent().offsetHeight : l.parent().height()), l = l.parent();
        this.x = a.x, this.y = a.y, this.width = n * s, this.height = r * o, this.zoom = 1, h && (e = parseFloat(h[0]), i = parseFloat(h[1]), n = parseFloat(h[2]), r = parseFloat(h[3]), this.zoom = this.width / this.height > n / r ? this.height / r : this.width / n, this.x = e, this.y = i, this.width = n, this.height = r)
    }, m.extend(m.ViewBox, {
        toString: function () {
            return this.x + " " + this.y + " " + this.width + " " + this.height
        }
    }), m.Element = m.invent({
        create: function (t) {
            this._stroke = m.defaults.attrs.stroke, (this.node = t) && (this.type = t.nodeName, this.node.instance = this, this._stroke = t.getAttribute("stroke") || this._stroke)
        }, extend: {
            x: function (t) {
                return null != t && (t = new m.Number(t), t.value /= this.transform("scaleX")), this.attr("x", t)
            }, y: function (t) {
                return null != t && (t = new m.Number(t), t.value /= this.transform("scaleY")), this.attr("y", t)
            }, cx: function (t) {
                return null == t ? this.x() + this.width() / 2 : this.x(t - this.width() / 2)
            }, cy: function (t) {
                return null == t ? this.y() + this.height() / 2 : this.y(t - this.height() / 2)
            }, move: function (t, e) {
                return this.x(t).y(e)
            }, center: function (t, e) {
                return this.cx(t).cy(e)
            }, width: function (t) {
                return this.attr("width", t)
            }, height: function (t) {
                return this.attr("height", t)
            }, size: function (t, e) {
                var i = r(this.bbox(), t, e);
                return this.width(new m.Number(i.width)).height(new m.Number(i.height))
            }, clone: function () {
                var t = f(this.node.cloneNode(!0));
                return this.after(t), t
            }, remove: function () {
                return this.parent() && this.parent().removeElement(this), this
            }, replace: function (t) {
                return this.after(t).remove(), t
            }, addTo: function (t) {
                return t.put(this)
            }, putIn: function (t) {
                return t.add(this)
            }, id: function (t) {
                return this.attr("id", t)
            }, inside: function (t, e) {
                var i = this.bbox();
                return t > i.x && e > i.y && t < i.x + i.width && e < i.y + i.height
            }, show: function () {
                return this.style("display", "")
            }, hide: function () {
                return this.style("display", "none")
            }, visible: function () {
                return "none" != this.style("display")
            }, toString: function () {
                return this.attr("id")
            }, classes: function () {
                var t = this.attr("class");
                return null == t ? [] : t.trim().split(/\s+/)
            }, hasClass: function (t) {
                return -1 != this.classes().indexOf(t)
            }, addClass: function (t) {
                if (!this.hasClass(t)) {
                    var e = this.classes();
                    e.push(t), this.attr("class", e.join(" "))
                }
                return this
            }, removeClass: function (t) {
                return this.hasClass(t) && this.attr("class", this.classes().filter(function (e) {
                    return e != t
                }).join(" ")), this
            }, toggleClass: function (t) {
                return this.hasClass(t) ? this.removeClass(t) : this.addClass(t)
            }, reference: function (t) {
                return m.get(this.attr(t))
            }, parent: function (t) {
                if (this.node.parentNode) {
                    var e = m.adopt(this.node.parentNode);
                    if (t)for (; !(e instanceof t) && e.node.parentNode instanceof SVGElement;)e = m.adopt(e.node.parentNode);
                    return e
                }
            }, doc: function () {
                return this instanceof m.Doc ? this : this.parent(m.Doc)
            }, "native": function () {
                return this.node
            }, svg: function (t) {
                var e = document.createElement("svg");
                if (!(t && this instanceof m.Parent))return e.appendChild(t = document.createElement("svg")), t.appendChild(this.node.cloneNode(!0)), e.innerHTML.replace(/^<svg>/, "").replace(/<\/svg>$/, "");
                e.innerHTML = "<svg>" + t.replace(/\n/, "").replace(/<(\w+)([^<]+?)\/>/g, "<$1$2></$1>") + "</svg>";
                for (var i = 0, n = e.firstChild.childNodes.length; n > i; i++)this.node.appendChild(e.firstChild.childNodes[i]);
                return this
            }
        }
    }), m.FX = m.invent({
        create: function (t) {
            this.target = t
        }, extend: {
            animate: function (t, e, i) {
                var n, r, s, o = this.target, a = this;
                return "object" == typeof t && (i = t.delay, e = t.ease, t = t.duration), t = "=" == t ? t : null == t ? 1e3 : new m.Number(t).valueOf(), e = e || "<>", a.at = function (t) {
                    var i;
                    if (t = 0 > t ? 0 : t > 1 ? 1 : t, null == n) {
                        n = [];
                        for (s in a.attrs)n.push(s);
                        if (o.morphArray && (a.destination.plot || n.indexOf("points") > -1)) {
                            var h, u = new o.morphArray(a.destination.plot || a.attrs.points || o.array);
                            a.destination.size && u.size(a.destination.size.width.to, a.destination.size.height.to), h = u.bbox(), a.destination.x ? u.move(a.destination.x.to, h.y) : a.destination.cx && u.move(a.destination.cx.to - h.width / 2, h.y), h = u.bbox(), a.destination.y ? u.move(h.x, a.destination.y.to) : a.destination.cy && u.move(h.x, a.destination.cy.to - h.height / 2), a.destination = {plot: o.array.morph(u)}
                        }
                    }
                    if (null == r) {
                        r = [];
                        for (s in a.styles)r.push(s)
                    }
                    for (t = "<>" == e ? -Math.cos(t * Math.PI) / 2 + .5 : ">" == e ? Math.sin(t * Math.PI / 2) : "<" == e ? -Math.cos(t * Math.PI / 2) + 1 : "-" == e ? t : "function" == typeof e ? e(t) : t, a.destination.plot ? o.plot(a.destination.plot.at(t)) : (a.destination.x ? o.x(a.destination.x.at(t)) : a.destination.cx && o.cx(a.destination.cx.at(t)), a.destination.y ? o.y(a.destination.y.at(t)) : a.destination.cy && o.cy(a.destination.cy.at(t)), a.destination.size && o.size(a.destination.size.width.at(t), a.destination.size.height.at(t))), a.destination.viewbox && o.viewbox(a.destination.viewbox.x.at(t), a.destination.viewbox.y.at(t), a.destination.viewbox.width.at(t), a.destination.viewbox.height.at(t)), a.destination.leading && o.leading(a.destination.leading.at(t)), i = n.length - 1; i >= 0; i--)o.attr(n[i], l(a.attrs[n[i]], t));
                    for (i = r.length - 1; i >= 0; i--)o.style(r[i], l(a.styles[r[i]], t));
                    a.situation.during && a.situation.during.call(o, t, function (e, i) {
                        return l({from: e, to: i}, t)
                    })
                }, "number" == typeof t && (this.timeout = setTimeout(function () {
                    var n = (new Date).getTime();
                    a.situation.start = n, a.situation.play = !0, a.situation.finish = n + t, a.situation.duration = t, a.situation.ease = e, a.render = function () {
                        if (a.situation.play === !0) {
                            var n = (new Date).getTime(), r = n > a.situation.finish ? 1 : (n - a.situation.start) / t;
                            a.situation.reversing && (r = -r + 1), a.at(r), n > a.situation.finish ? (a.destination.plot && o.plot(new m.PointArray(a.destination.plot.destination).settle()), a.situation.loop === !0 || "number" == typeof a.situation.loop && a.situation.loop > 0 ? (a.situation.reverse && (a.situation.reversing = !a.situation.reversing), "number" == typeof a.situation.loop && ((!a.situation.reverse || a.situation.reversing) && --a.situation.loop, a.situation.reverse || 1 != a.situation.loop || --a.situation.loop), a.animate(t, e, i)) : a.situation.after ? a.situation.after.apply(o, [a]) : a.stop()) : a.animationFrame = requestAnimationFrame(a.render)
                        } else a.animationFrame = requestAnimationFrame(a.render)
                    }, a.render()
                }, new m.Number(i).valueOf())), this
            }, bbox: function () {
                return this.target.bbox()
            }, attr: function (t, e) {
                if ("object" == typeof t)for (var i in t)this.attr(i, t[i]); else {
                    var n = this.target.attr(t);
                    "transform" == t ? (this.attrs[t] && (e = this.attrs[t].destination.multiply(e)), this.attrs[t] = this.target.ctm().morph(e), this.param && (e = this.target.transform("rotation"), this.attrs[t].param = {
                        from: this.target.param || {
                            rotation: e,
                            cx: this.param.cx,
                            cy: this.param.cy
                        }, to: this.param
                    })) : this.attrs[t] = m.Color.isColor(e) ? new m.Color(n).morph(e) : m.regex.unit.test(e) ? new m.Number(n).morph(e) : {
                        from: n,
                        to: e
                    }
                }
                return this
            }, style: function (t, e) {
                if ("object" == typeof t)for (var i in t)this.style(i, t[i]); else this.styles[t] = {
                    from: this.target.style(t),
                    to: e
                };
                return this
            }, x: function (t) {
                return this.destination.x = new m.Number(this.target.x()).morph(t), this
            }, y: function (t) {
                return this.destination.y = new m.Number(this.target.y()).morph(t), this
            }, cx: function (t) {
                return this.destination.cx = new m.Number(this.target.cx()).morph(t), this
            }, cy: function (t) {
                return this.destination.cy = new m.Number(this.target.cy()).morph(t), this
            }, move: function (t, e) {
                return this.x(t).y(e)
            }, center: function (t, e) {
                return this.cx(t).cy(e)
            }, size: function (t, e) {
                if (this.target instanceof m.Text)this.attr("font-size", t); else {
                    var i = this.target.bbox();
                    this.destination.size = {
                        width: new m.Number(i.width).morph(t),
                        height: new m.Number(i.height).morph(e)
                    }
                }
                return this
            }, plot: function (t) {
                return this.destination.plot = t, this
            }, leading: function (t) {
                return this.target.destination.leading && (this.destination.leading = new m.Number(this.target.destination.leading).morph(t)), this
            }, viewbox: function (t, e, i, n) {
                if (this.target instanceof m.Container) {
                    var r = this.target.viewbox();
                    this.destination.viewbox = {
                        x: new m.Number(r.x).morph(t),
                        y: new m.Number(r.y).morph(e),
                        width: new m.Number(r.width).morph(i),
                        height: new m.Number(r.height).morph(n)
                    }
                }
                return this
            }, update: function (t) {
                return this.target instanceof m.Stop && (null != t.opacity && this.attr("stop-opacity", t.opacity), null != t.color && this.attr("stop-color", t.color), null != t.offset && this.attr("offset", new m.Number(t.offset))), this
            }, during: function (t) {
                return this.situation.during = t, this
            }, after: function (t) {
                return this.situation.after = t, this
            }, loop: function (t, e) {
                return this.situation.loop = this.situation.loops = t || !0, this.situation.reverse = !!e, this
            }, stop: function (t) {
                return t === !0 ? (this.animate(0), this.situation.after && this.situation.after.apply(this.target, [this])) : (clearTimeout(this.timeout), cancelAnimationFrame(this.animationFrame), this.attrs = {}, this.styles = {}, this.situation = {}, this.destination = {}), this
            }, pause: function () {
                return this.situation.play === !0 && (this.situation.play = !1, this.situation.pause = (new Date).getTime()), this
            }, play: function () {
                if (this.situation.play === !1) {
                    var t = (new Date).getTime() - this.situation.pause;
                    this.situation.finish += t, this.situation.start += t, this.situation.play = !0
                }
                return this
            }
        }, parent: m.Element, construct: {
            animate: function (t, e, i) {
                return (this.fx || (this.fx = new m.FX(this))).stop().animate(t, e, i)
            }, stop: function (t) {
                return this.fx && this.fx.stop(t), this
            }, pause: function () {
                return this.fx && this.fx.pause(), this
            }, play: function () {
                return this.fx && this.fx.play(), this
            }
        }
    }), m.BBox = m.invent({
        create: function (t) {
            if (t) {
                var e;
                try {
                    e = t.node.getBBox()
                } catch (i) {
                    e = {
                        x: t.node.clientLeft,
                        y: t.node.clientTop,
                        width: t.node.clientWidth,
                        height: t.node.clientHeight
                    }
                }
                this.x = e.x, this.y = e.y, this.width = e.width, this.height = e.height
            }
            d(this)
        }, parent: m.Element, construct: {
            bbox: function () {
                return new m.BBox(this)
            }
        }
    }), m.TBox = m.invent({
        create: function (t) {
            if (t) {
                var e = t.ctm().extract(), i = t.bbox();
                this.width = i.width * e.scaleX, this.height = i.height * e.scaleY, this.x = i.x + e.x, this.y = i.y + e.y
            }
            d(this)
        }, parent: m.Element, construct: {
            tbox: function () {
                return new m.TBox(this)
            }
        }
    }), m.RBox = m.invent({
        create: function (t) {
            if (t) {
                var e = t.doc().parent(), i = t.node.getBoundingClientRect(), n = 1;
                for (this.x = i.left, this.y = i.top, this.x -= e.offsetLeft, this.y -= e.offsetTop; e = e.offsetParent;)this.x -= e.offsetLeft, this.y -= e.offsetTop;
                for (e = t; e.parent && (e = e.parent());)e.viewbox && (n *= e.viewbox().zoom, this.x -= e.x() || 0, this.y -= e.y() || 0);
                this.width = i.width /= n, this.height = i.height /= n
            }
            d(this), this.x += window.scrollX, this.y += window.scrollY
        }, parent: m.Element, construct: {
            rbox: function () {
                return new m.RBox(this)
            }
        }
    }), [m.BBox, m.TBox, m.RBox].forEach(function (t) {
        m.extend(t, {
            merge: function (e) {
                var i = new t;
                return i.x = Math.min(this.x, e.x), i.y = Math.min(this.y, e.y), i.width = Math.max(this.x + this.width, e.x + e.width) - i.x, i.height = Math.max(this.y + this.height, e.y + e.height) - i.y, d(i)
            }
        })
    }), m.Matrix = m.invent({
        create: function (t) {
            var e, i = o([1, 0, 0, 1, 0, 0]);
            for (t = t && t.node && t.node.getCTM ? t.node.getCTM() : "string" == typeof t ? u(t) : 6 == arguments.length ? o([].slice.call(arguments)) : "object" == typeof t ? t : i, e = g.length - 1; e >= 0; e--)this[g[e]] = t && "number" == typeof t[g[e]] ? t[g[e]] : i[g[e]]
        }, extend: {
            extract: function () {
                var t = s(this, 0, 1), e = s(this, 1, 0), i = 180 / Math.PI * Math.atan2(t.y, t.x) - 90;
                return {
                    x: this.e,
                    y: this.f,
                    skewX: -i,
                    skewY: 180 / Math.PI * Math.atan2(e.y, e.x),
                    scaleX: Math.sqrt(this.a * this.a + this.b * this.b),
                    scaleY: Math.sqrt(this.c * this.c + this.d * this.d),
                    rotation: i
                }
            }, clone: function () {
                return new m.Matrix(this)
            }, morph: function (t) {
                return this.destination = new m.Matrix(t), this
            }, at: function (t) {
                if (!this.destination)return this;
                var e = new m.Matrix({
                    a: this.a + (this.destination.a - this.a) * t,
                    b: this.b + (this.destination.b - this.b) * t,
                    c: this.c + (this.destination.c - this.c) * t,
                    d: this.d + (this.destination.d - this.d) * t,
                    e: this.e + (this.destination.e - this.e) * t,
                    f: this.f + (this.destination.f - this.f) * t
                });
                if (this.param && this.param.to) {
                    var i = {
                        rotation: this.param.from.rotation + (this.param.to.rotation - this.param.from.rotation) * t,
                        cx: this.param.from.cx,
                        cy: this.param.from.cy
                    };
                    e = e.rotate((this.param.to.rotation - 2 * this.param.from.rotation) * t, i.cx, i.cy), e.param = i
                }
                return e
            }, multiply: function (t) {
                return new m.Matrix(this.native().multiply(a(t).native()))
            }, inverse: function () {
                return new m.Matrix(this.native().inverse())
            }, translate: function (t, e) {
                return new m.Matrix(this.native().translate(t || 0, e || 0))
            }, scale: function (t, e, i, n) {
                return (1 == arguments.length || 3 == arguments.length) && (e = t), 3 == arguments.length && (n = i, i = e), this.around(i, n, new m.Matrix(t, 0, 0, e, 0, 0))
            }, rotate: function (t, e, i) {
                return t = m.utils.radians(t), this.around(e, i, new m.Matrix(Math.cos(t), Math.sin(t), -Math.sin(t), Math.cos(t), 0, 0))
            }, flip: function (t, e) {
                return "x" == t ? this.scale(-1, 1, e, 0) : this.scale(1, -1, 0, e)
            }, skew: function (t, e, i, n) {
                return this.around(i, n, this.native().skewX(t || 0).skewY(e || 0))
            }, around: function (t, e, i) {
                return this.multiply(new m.Matrix(1, 0, 0, 1, t || 0, e || 0)).multiply(i).multiply(new m.Matrix(1, 0, 0, 1, -t || 0, -e || 0))
            }, "native": function () {
                for (var t = m.parser.draw.node.createSVGMatrix(), e = g.length - 1; e >= 0; e--)t[g[e]] = this[g[e]];
                return t
            }, toString: function () {
                return "matrix(" + this.a + "," + this.b + "," + this.c + "," + this.d + "," + this.e + "," + this.f + ")"
            }
        }, parent: m.Element, construct: {
            ctm: function () {
                return new m.Matrix(this)
            }
        }
    }), m.extend(m.Element, {
        attr: function (t, e, i) {
            if (null == t) {
                for (t = {}, e = this.node.attributes, i = e.length - 1; i >= 0; i--)t[e[i].nodeName] = m.regex.isNumber.test(e[i].nodeValue) ? parseFloat(e[i].nodeValue) : e[i].nodeValue;
                return t
            }
            if ("object" == typeof t)for (e in t)this.attr(e, t[e]); else if (null === e)this.node.removeAttribute(t); else {
                if (null == e)return e = this.node.getAttribute(t), null == e ? m.defaults.attrs[t] : m.regex.isNumber.test(e) ? parseFloat(e) : e;
                "stroke-width" == t ? this.attr("stroke", parseFloat(e) > 0 ? this._stroke : null) : "stroke" == t && (this._stroke = e), ("fill" == t || "stroke" == t) && (m.regex.isImage.test(e) && (e = this.doc().defs().image(e, 0, 0)), e instanceof m.Image && (e = this.doc().defs().pattern(0, 0, function () {
                    this.add(e)
                }))), "number" == typeof e ? e = new m.Number(e) : m.Color.isColor(e) ? e = new m.Color(e) : Array.isArray(e) ? e = new m.Array(e) : e instanceof m.Matrix && e.param && (this.param = e.param), "leading" == t ? this.leading && this.leading(e) : "string" == typeof i ? this.node.setAttributeNS(i, t, e.toString()) : this.node.setAttribute(t, e.toString()), !this.rebuild || "font-size" != t && "x" != t || this.rebuild(t, e)
            }
            return this
        }
    }), m.extend(m.Element, m.FX, {
        transform: function (t, e) {
            var i, n = this.target || this;
            if ("object" != typeof t)return i = n.ctm().extract(), "object" == typeof this.param && (i.rotation = this.param.rotation, i.cx = this.param.cx, i.cy = this.param.cy), "string" == typeof t ? i[t] : i;
            if (i = this instanceof m.FX && this.attrs.transform ? this.attrs.transform : new m.Matrix(n), e = !!e || !!t.relative, null != t.a)i = e ? i.multiply(new m.Matrix(t)) : new m.Matrix(t); else if (null != t.rotation)h(t, n), e && (t.rotation += this.param && null != this.param.rotation ? this.param.rotation : i.extract().rotation), this.param = t, this instanceof m.Element && (i = e ? n.attr("transform", i + " rotate(" + [t.rotation, t.cx, t.cy].join() + ")").ctm() : i.rotate(t.rotation - i.extract().rotation, t.cx, t.cy)); else if (null != t.scale || null != t.scaleX || null != t.scaleY) {
                if (h(t, n), t.scaleX = null != t.scale ? t.scale : null != t.scaleX ? t.scaleX : 1, t.scaleY = null != t.scale ? t.scale : null != t.scaleY ? t.scaleY : 1, !e) {
                    var r = i.extract();
                    t.scaleX = 1 * t.scaleX / r.scaleX, t.scaleY = 1 * t.scaleY / r.scaleY
                }
                i = i.scale(t.scaleX, t.scaleY, t.cx, t.cy)
            } else if (null != t.skewX || null != t.skewY) {
                if (h(t, n), t.skewX = null != t.skewX ? t.skewX : 0, t.skewY = null != t.skewY ? t.skewY : 0, !e) {
                    var r = i.extract();
                    i = i.multiply((new m.Matrix).skew(r.skewX, r.skewY, t.cx, t.cy).inverse())
                }
                i = i.skew(t.skewX, t.skewY, t.cx, t.cy)
            } else t.flip ? i = i.flip(t.flip, null == t.offset ? n.bbox()["c" + t.flip] : t.offset) : (null != t.x || null != t.y) && (e ? i = i.translate(t.x, t.y) : (null != t.x && (i.e = t.x), null != t.y && (i.f = t.y)));
            return this.attr("transform", i)
        }
    }), m.extend(m.Element, {
        untransform: function () {
            return this.attr("transform", null)
        }
    }), m.extend(m.Element, {
        style: function (e, i) {
            if (0 == arguments.length)return this.node.style.cssText || "";
            if (arguments.length < 2)if ("object" == typeof e)for (i in e)this.style(i, e[i]); else {
                if (!m.regex.isCss.test(e))return this.node.style[t(e)];
                e = e.split(";");
                for (var n = 0; n < e.length; n++)i = e[n].split(":"), this.style(i[0].replace(/\s+/g, ""), i[1])
            } else this.node.style[t(e)] = null === i || m.regex.isBlank.test(i) ? "" : i;
            return this
        }
    }), m.Parent = m.invent({
        create: function (t) {
            this.constructor.call(this, t)
        }, inherit: m.Element, extend: {
            children: function () {
                return m.utils.map(this.node.childNodes, function (t) {
                    return m.adopt(t)
                })
            }, add: function (t, e) {
                return this.has(t) || (e = null == e ? this.children().length : e, this.node.insertBefore(t.node, this.node.childNodes[e] || null)), this
            }, put: function (t, e) {
                return this.add(t, e), t
            }, has: function (t) {
                return this.index(t) >= 0
            }, index: function (t) {
                return this.children().indexOf(t)
            }, get: function (t) {
                return this.children()[t]
            }, first: function () {
                return this.children()[0]
            }, last: function () {
                return this.children()[this.children().length - 1]
            }, each: function (t, e) {
                var i, n, r = this.children();
                for (i = 0, n = r.length; n > i; i++)r[i]instanceof m.Element && t.apply(r[i], [i, r]), e && r[i]instanceof m.Container && r[i].each(t, e);
                return this
            }, removeElement: function (t) {
                return this.node.removeChild(t.node), this
            }, clear: function () {
                for (; this.node.hasChildNodes();)this.node.removeChild(this.node.lastChild);
                return delete this._defs, this
            }, defs: function () {
                return this.doc().defs()
            }
        }
    }), m.Container = m.invent({
        create: function (t) {
            this.constructor.call(this, t)
        }, inherit: m.Parent, extend: {
            viewbox: function (t) {
                return 0 == arguments.length ? new m.ViewBox(this) : (t = 1 == arguments.length ? [t.x, t.y, t.width, t.height] : [].slice.call(arguments), this.attr("viewBox", t))
            }
        }
    }), ["click", "dblclick", "mousedown", "mouseup", "mouseover", "mouseout", "mousemove", "touchstart", "touchmove", "touchleave", "touchend", "touchcancel"].forEach(function (t) {
        m.Element.prototype[t] = function (e) {
            var i = this;
            return this.node["on" + t] = "function" == typeof e ? function () {
                return e.apply(i, arguments)
            } : null, this
        }
    }), m.listeners = [], m.handlerMap = [], m.on = function (t, e, i) {
        var n = i.bind(t.instance || t), r = (m.handlerMap.indexOf(t) + 1 || m.handlerMap.push(t)) - 1, s = e.split(".")[0], o = e.split(".")[1] || "*";
        m.listeners[r] = m.listeners[r] || {}, m.listeners[r][s] = m.listeners[r][s] || {}, m.listeners[r][s][o] = m.listeners[r][s][o] || {}, m.listeners[r][s][o][i] = n, t.addEventListener(s, n, !1)
    }, m.off = function (t, e, i) {
        var n = m.handlerMap.indexOf(t), r = e && e.split(".")[0], s = e && e.split(".")[1];
        if (-1 != n)if (i)m.listeners[n][r] && m.listeners[n][r][s || "*"] && (t.removeEventListener(r, m.listeners[n][r][s || "*"][i], !1), delete m.listeners[n][r][s || "*"][i]); else if (s && r) {
            if (m.listeners[n][r] && m.listeners[n][r][s]) {
                for (i in m.listeners[n][r][s])m.off(t, [r, s].join("."), i);
                delete m.listeners[n][r][s]
            }
        } else if (s)for (e in m.listeners[n])for (namespace in m.listeners[n][e])s === namespace && m.off(t, [e, s].join(".")); else if (r) {
            if (m.listeners[n][r]) {
                for (namespace in m.listeners[n][r])m.off(t, [r, namespace].join("."));
                delete m.listeners[n][r]
            }
        } else {
            for (e in m.listeners[n])m.off(t, e);
            delete m.listeners[n]
        }
    }, m.extend(m.Element, {
        on: function (t, e) {
            return m.on(this.node, t, e), this
        }, off: function (t, e) {
            return m.off(this.node, t, e), this
        }, fire: function (t, e) {
            return t instanceof Event ? this.node.dispatchEvent(t) : this.node.dispatchEvent(new y(t, {detail: e})), this
        }
    }), m.Defs = m.invent({create: "defs", inherit: m.Container}), m.G = m.invent({
        create: "g",
        inherit: m.Container,
        extend: {
            x: function (t) {
                return null == t ? this.transform("x") : this.transform({x: -this.x() + t}, !0)
            }, y: function (t) {
                return null == t ? this.transform("y") : this.transform({y: -this.y() + t}, !0)
            }, cx: function (t) {
                return null == t ? this.tbox().cx : this.x(t - this.tbox().width / 2)
            }, cy: function (t) {
                return null == t ? this.tbox().cy : this.y(t - this.tbox().height / 2)
            }
        },
        construct: {
            group: function () {
                return this.put(new m.G)
            }
        }
    }), m.extend(m.Element, {
        siblings: function () {
            return this.parent().children()
        }, position: function () {
            return this.parent().index(this)
        }, next: function () {
            return this.siblings()[this.position() + 1]
        }, previous: function () {
            return this.siblings()[this.position() - 1]
        }, forward: function () {
            var t = this.position() + 1, e = this.parent();
            return e.removeElement(this).add(this, t), e instanceof m.Doc && e.node.appendChild(e.defs().node), this
        }, backward: function () {
            var t = this.position();
            return t > 0 && this.parent().removeElement(this).add(this, t - 1), this
        }, front: function () {
            var t = this.parent();
            return t.node.appendChild(this.node), t instanceof m.Doc && t.node.appendChild(t.defs().node), this
        }, back: function () {
            return this.position() > 0 && this.parent().removeElement(this).add(this, 0), this
        }, before: function (t) {
            t.remove();
            var e = this.position();
            return this.parent().add(t, e), this
        }, after: function (t) {
            t.remove();
            var e = this.position();
            return this.parent().add(t, e + 1), this
        }
    }), m.Mask = m.invent({
        create: function () {
            this.constructor.call(this, m.create("mask")), this.targets = []
        }, inherit: m.Container, extend: {
            remove: function () {
                for (var t = this.targets.length - 1; t >= 0; t--)this.targets[t] && this.targets[t].unmask();
                return delete this.targets, this.parent().removeElement(this), this
            }
        }, construct: {
            mask: function () {
                return this.defs().put(new m.Mask)
            }
        }
    }), m.extend(m.Element, {
        maskWith: function (t) {
            return this.masker = t instanceof m.Mask ? t : this.parent().mask().add(t), this.masker.targets.push(this), this.attr("mask", 'url("#' + this.masker.attr("id") + '")')
        }, unmask: function () {
            return delete this.masker, this.attr("mask", null)
        }
    }), m.ClipPath = m.invent({
        create: function () {
            this.constructor.call(this, m.create("clipPath")), this.targets = []
        }, inherit: m.Container, extend: {
            remove: function () {
                for (var t = this.targets.length - 1; t >= 0; t--)this.targets[t] && this.targets[t].unclip();
                return delete this.targets, this.parent().removeElement(this), this
            }
        }, construct: {
            clip: function () {
                return this.defs().put(new m.ClipPath)
            }
        }
    }), m.extend(m.Element, {
        clipWith: function (t) {
            return this.clipper = t instanceof m.ClipPath ? t : this.parent().clip().add(t), this.clipper.targets.push(this), this.attr("clip-path", 'url("#' + this.clipper.attr("id") + '")')
        }, unclip: function () {
            return delete this.clipper, this.attr("clip-path", null)
        }
    }), m.Gradient = m.invent({
        create: function (t) {
            this.constructor.call(this, m.create(t + "Gradient")), this.type = t
        }, inherit: m.Container, extend: {
            at: function (t, e, i) {
                return this.put(new m.Stop).update(t, e, i)
            }, update: function (t) {
                return this.clear(), "function" == typeof t && t.call(this, this), this
            }, fill: function () {
                return "url(#" + this.id() + ")"
            }, toString: function () {
                return this.fill()
            }
        }, construct: {
            gradient: function (t, e) {
                return this.defs().gradient(t, e)
            }
        }
    }), m.extend(m.Gradient, m.FX, {
        from: function (t, e) {
            return "radial" == (this.target || this).type ? this.attr({
                fx: new m.Number(t),
                fy: new m.Number(e)
            }) : this.attr({x1: new m.Number(t), y1: new m.Number(e)})
        }, to: function (t, e) {
            return "radial" == (this.target || this).type ? this.attr({
                cx: new m.Number(t),
                cy: new m.Number(e)
            }) : this.attr({x2: new m.Number(t), y2: new m.Number(e)})
        }
    }), m.extend(m.Defs, {
        gradient: function (t, e) {
            return this.put(new m.Gradient(t)).update(e)
        }
    }), m.Stop = m.invent({
        create: "stop", inherit: m.Element, extend: {
            update: function (t) {
                return ("number" == typeof t || t instanceof m.Number) && (t = {
                    offset: arguments[0],
                    color: arguments[1],
                    opacity: arguments[2]
                }), null != t.opacity && this.attr("stop-opacity", t.opacity), null != t.color && this.attr("stop-color", t.color), null != t.offset && this.attr("offset", new m.Number(t.offset)), this
            }
        }
    }), m.Pattern = m.invent({
        create: "pattern", inherit: m.Container, extend: {
            fill: function () {
                return "url(#" + this.id() + ")"
            }, update: function (t) {
                return this.clear(), "function" == typeof t && t.call(this, this), this
            }, toString: function () {
                return this.fill()
            }
        }, construct: {
            pattern: function (t, e, i) {
                return this.defs().pattern(t, e, i)
            }
        }
    }), m.extend(m.Defs, {
        pattern: function (t, e, i) {
            return this.put(new m.Pattern).update(i).attr({
                x: 0,
                y: 0,
                width: t,
                height: e,
                patternUnits: "userSpaceOnUse"
            })
        }
    }), m.Doc = m.invent({
        create: function (t) {
            t && (t = "string" == typeof t ? document.getElementById(t) : t, "svg" == t.nodeName ? this.constructor.call(this, t) : (this.constructor.call(this, m.create("svg")), t.appendChild(this.node)), this.namespace().size("100%", "100%").defs())
        }, inherit: m.Container, extend: {
            namespace: function () {
                return this.attr({xmlns: m.ns, version: "1.1"}).attr("xmlns:xlink", m.xlink, m.xmlns)
            }, defs: function () {
                if (!this._defs) {
                    var t;
                    this._defs = (t = this.node.getElementsByTagName("defs")[0]) ? m.adopt(t) : new m.Defs, this.node.appendChild(this._defs.node)
                }
                return this._defs
            }, parent: function () {
                return "#document" == this.node.parentNode.nodeName ? null : this.node.parentNode
            }, spof: function () {
                var t = this.node.getScreenCTM();
                return t && this.style("left", -t.e % 1 + "px").style("top", -t.f % 1 + "px"), this
            }, remove: function () {
                return this.parent() && this.parent().removeChild(this.node), this
            }
        }
    }), m.Shape = m.invent({
        create: function (t) {
            this.constructor.call(this, t)
        }, inherit: m.Element
    }), m.Bare = m.invent({
        create: function (t, e) {
            if (this.constructor.call(this, m.create(t)), e)for (var i in e.prototype)"function" == typeof e.prototype[i] && (t[i] = e.prototype[i])
        }, inherit: m.Element, extend: {
            words: function (t) {
                for (; this.node.hasChildNodes();)this.node.removeChild(this.node.lastChild);
                return this.node.appendChild(document.createTextNode(t)), this
            }
        }
    }), m.extend(m.Parent, {
        element: function (t, e) {
            return this.put(new m.Bare(t, e))
        }, symbol: function () {
            return this.defs().element("symbol", m.Container)
        }
    }), m.Use = m.invent({
        create: "use", inherit: m.Shape, extend: {
            element: function (t, e) {
                return this.attr("href", (e || "") + "#" + t, m.xlink)
            }
        }, construct: {
            use: function (t, e) {
                return this.put(new m.Use).element(t, e)
            }
        }
    }), m.Rect = m.invent({
        create: "rect", inherit: m.Shape, construct: {
            rect: function (t, e) {
                return this.put((new m.Rect).size(t, e))
            }
        }
    }), m.Circle = m.invent({
        create: "circle", inherit: m.Shape, construct: {
            circle: function (t) {
                return this.put(new m.Circle).rx(new m.Number(t).divide(2)).move(0, 0)
            }
        }
    }), m.extend(m.Circle, m.FX, {
        rx: function (t) {
            return this.attr("r", t)
        }, ry: function (t) {
            return this.rx(t)
        }
    }), m.Ellipse = m.invent({
        create: "ellipse", inherit: m.Shape, construct: {
            ellipse: function (t, e) {
                return this.put(new m.Ellipse).size(t, e).move(0, 0)
            }
        }
    }), m.extend(m.Ellipse, m.Rect, m.FX, {
        rx: function (t) {
            return this.attr("rx", t)
        }, ry: function (t) {
            return this.attr("ry", t)
        }
    }), m.extend(m.Circle, m.Ellipse, {
        x: function (t) {
            return null == t ? this.cx() - this.rx() : this.cx(t + this.rx())
        }, y: function (t) {
            return null == t ? this.cy() - this.ry() : this.cy(t + this.ry())
        }, cx: function (t) {
            return null == t ? this.attr("cx") : this.attr("cx", new m.Number(t).divide(this.transform("scaleX")))
        }, cy: function (t) {
            return null == t ? this.attr("cy") : this.attr("cy", new m.Number(t).divide(this.transform("scaleY")))
        }, width: function (t) {
            return null == t ? 2 * this.rx() : this.rx(new m.Number(t).divide(2))
        }, height: function (t) {
            return null == t ? 2 * this.ry() : this.ry(new m.Number(t).divide(2))
        }, size: function (t, e) {
            var i = r(this.bbox(), t, e);
            return this.rx(new m.Number(i.width).divide(2)).ry(new m.Number(i.height).divide(2))
        }
    }), m.Line = m.invent({
        create: "line", inherit: m.Shape, extend: {
            array: function () {
                return new m.PointArray([[this.attr("x1"), this.attr("y1")], [this.attr("x2"), this.attr("y2")]])
            }, plot: function (t, e, i, n) {
                return t = 4 == arguments.length ? {
                    x1: t,
                    y1: e,
                    x2: i,
                    y2: n
                } : new m.PointArray(t).toLine(), this.attr(t)
            }, move: function (t, e) {
                return this.attr(this.array().move(t, e).toLine())
            }, size: function (t, e) {
                var i = r(this.bbox(), t, e);
                return this.attr(this.array().size(i.width, i.height).toLine())
            }
        }, construct: {
            line: function (t, e, i, n) {
                return this.put(new m.Line).plot(t, e, i, n)
            }
        }
    }), m.Polyline = m.invent({
        create: "polyline", inherit: m.Shape, construct: {
            polyline: function (t) {
                return this.put(new m.Polyline).plot(t)
            }
        }
    }), m.Polygon = m.invent({
        create: "polygon", inherit: m.Shape, construct: {
            polygon: function (t) {
                return this.put(new m.Polygon).plot(t)
            }
        }
    }), m.extend(m.Polyline, m.Polygon, {
        array: function () {
            return this._array || (this._array = new m.PointArray(this.attr("points")))
        }, plot: function (t) {
            return this.attr("points", this._array = new m.PointArray(t))
        }, move: function (t, e) {
            return this.attr("points", this.array().move(t, e))
        }, size: function (t, e) {
            var i = r(this.bbox(), t, e);
            return this.attr("points", this.array().size(i.width, i.height))
        }
    }), m.extend(m.Line, m.Polyline, m.Polygon, {
        morphArray: m.PointArray, x: function (t) {
            return null == t ? this.bbox().x : this.move(t, this.bbox().y)
        }, y: function (t) {
            return null == t ? this.bbox().y : this.move(this.bbox().x, t)
        }, width: function (t) {
            var e = this.bbox();
            return null == t ? e.width : this.size(t, e.height)
        }, height: function (t) {
            var e = this.bbox();
            return null == t ? e.height : this.size(e.width, t)
        }
    }), m.Path = m.invent({
        create: "path", inherit: m.Shape, extend: {
            morphArray: m.PathArray, array: function () {
                return this._array || (this._array = new m.PathArray(this.attr("d")))
            }, plot: function (t) {
                return this.attr("d", this._array = new m.PathArray(t))
            }, move: function (t, e) {
                return this.attr("d", this.array().move(t, e))
            }, x: function (t) {
                return null == t ? this.bbox().x : this.move(t, this.bbox().y)
            }, y: function (t) {
                return null == t ? this.bbox().y : this.move(this.bbox().x, t)
            }, size: function (t, e) {
                var i = r(this.bbox(), t, e);
                return this.attr("d", this.array().size(i.width, i.height))
            }, width: function (t) {
                return null == t ? this.bbox().width : this.size(t, this.bbox().height)
            }, height: function (t) {
                return null == t ? this.bbox().height : this.size(this.bbox().width, t)
            }
        }, construct: {
            path: function (t) {
                return this.put(new m.Path).plot(t)
            }
        }
    }), m.Image = m.invent({
        create: "image", inherit: m.Shape, extend: {
            load: function (t) {
                if (!t)return this;
                var e = this, i = document.createElement("img");
                return i.onload = function () {
                    var n = e.doc(m.Pattern);
                    0 == e.width() && 0 == e.height() && e.size(i.width, i.height), n && 0 == n.width() && 0 == n.height() && n.size(e.width(), e.height()), "function" == typeof e._loaded && e._loaded.call(e, {
                        width: i.width,
                        height: i.height,
                        ratio: i.width / i.height,
                        url: t
                    })
                }, this.attr("href", i.src = this.src = t, m.xlink)
            }, loaded: function (t) {
                return this._loaded = t, this
            }
        }, construct: {
            image: function (t, e, i) {
                return this.put(new m.Image).load(t).size(e || 0, i || e || 0)
            }
        }
    }), m.Text = m.invent({
        create: function () {
            this.constructor.call(this, m.create("text")), this._leading = new m.Number(1.3), this._rebuild = !0, this._build = !1, this.attr("font-family", m.defaults.attrs["font-family"])
        }, inherit: m.Shape, extend: {
            x: function (t) {
                return null == t ? this.attr("x") : (this.textPath || this.lines().each(function () {
                    this.newLined && this.x(t)
                }), this.attr("x", t))
            }, y: function (t) {
                var e = this.attr("y"), i = "number" == typeof e ? e - this.bbox().y : 0;
                return null == t ? "number" == typeof e ? e - i : e : this.attr("y", "number" == typeof t ? t + i : t)
            }, cx: function (t) {
                return null == t ? this.bbox().cx : this.x(t - this.bbox().width / 2)
            }, cy: function (t) {
                return null == t ? this.bbox().cy : this.y(t - this.bbox().height / 2)
            }, text: function (t) {
                if ("undefined" == typeof t)return this.content;
                if (this.clear().build(!0), "function" == typeof t)t.call(this, this); else {
                    t = (this.content = t).split("\n");
                    for (var e = 0, i = t.length; i > e; e++)this.tspan(t[e]).newLine()
                }
                return this.build(!1).rebuild()
            }, size: function (t) {
                return this.attr("font-size", t).rebuild()
            }, leading: function (t) {
                return null == t ? this._leading : (this._leading = new m.Number(t), this.rebuild())
            }, lines: function () {
                for (var t = 0, e = this.node.childNodes.length, i = []; e > t; t++)this.node.childNodes[t]instanceof SVGElement && i.push(m.adopt(this.node.childNodes[t]));
                return new m.Set(i)
            }, rebuild: function (t) {
                if ("boolean" == typeof t && (this._rebuild = t), this._rebuild) {
                    var e = this;
                    this.lines().each(function () {
                        this.newLined && (this.textPath || this.attr("x", e.attr("x")), this.attr("dy", e._leading * new m.Number(e.attr("font-size"))))
                    }), this.fire("rebuild")
                }
                return this
            }, build: function (t) {
                return this._build = !!t, this
            }
        }, construct: {
            text: function (t) {
                return this.put(new m.Text).text(t)
            }, plain: function (t) {
                return this.put(new m.Text).plain(t)
            }
        }
    }), m.Tspan = m.invent({
        create: "tspan", inherit: m.Shape, extend: {
            text: function (t) {
                return "function" == typeof t ? t.call(this, this) : this.plain(t), this
            }, dx: function (t) {
                return this.attr("dx", t)
            }, dy: function (t) {
                return this.attr("dy", t)
            }, newLine: function () {
                var t = this.doc(m.Text);
                return this.newLined = !0, this.dy(t._leading * t.attr("font-size")).attr("x", t.x())
            }
        }
    }), m.extend(m.Text, m.Tspan, {
        plain: function (t) {
            return this._build === !1 && this.clear(), this.node.appendChild(document.createTextNode(this.content = t)), this
        }, tspan: function (t) {
            var e = (this.textPath() || this).node, i = new m.Tspan;
            return this._build === !1 && this.clear(), e.appendChild(i.node), this instanceof m.Text && this.lines().add(i), i.text(t)
        }, clear: function () {
            for (var t = (this.textPath() || this).node; t.hasChildNodes();)t.removeChild(t.lastChild);
            return this instanceof m.Text && (this.content = ""), this
        }, length: function () {
            return this.node.getComputedTextLength()
        }
    }), m.TextPath = m.invent({
        create: "textPath", inherit: m.Element, parent: m.Text, construct: {
            path: function (t) {
                for (var e = new m.TextPath, i = this.doc().defs().path(t); this.node.hasChildNodes();)e.node.appendChild(this.node.firstChild);
                return this.node.appendChild(e.node), e.attr("href", "#" + i, m.xlink), this
            }, plot: function (t) {
                var e = this.track();
                return e && e.plot(t), this
            }, track: function () {
                var t = this.textPath();
                return t ? t.reference("href") : void 0
            }, textPath: function () {
                return this.node.firstChild && "textPath" == this.node.firstChild.nodeName ? m.adopt(this.node.firstChild) : void 0
            }
        }
    }), m.Nested = m.invent({
        create: function () {
            this.constructor.call(this, m.create("svg")), this.style("overflow", "visible")
        }, inherit: m.Container, construct: {
            nested: function () {
                return this.put(new m.Nested)
            }
        }
    }), m.A = m.invent({
        create: "a", inherit: m.Container, extend: {
            to: function (t) {
                return this.attr("href", t, m.xlink)
            }, show: function (t) {
                return this.attr("show", t, m.xlink)
            }, target: function (t) {
                return this.attr("target", t)
            }
        }, construct: {
            link: function (t) {
                return this.put(new m.A).to(t)
            }
        }
    }), m.extend(m.Element, {
        linkTo: function (t) {
            var e = new m.A;
            return "function" == typeof t ? t.call(e, e) : e.to(t), this.parent().put(e).put(this)
        }
    }), m.Marker = m.invent({
        create: "marker", inherit: m.Container, extend: {
            width: function (t) {
                return this.attr("markerWidth", t)
            }, height: function (t) {
                return this.attr("markerHeight", t)
            }, ref: function (t, e) {
                return this.attr("refX", t).attr("refY", e)
            }, update: function (t) {
                return this.clear(), "function" == typeof t && t.call(this, this), this
            }, toString: function () {
                return "url(#" + this.id() + ")"
            }
        }, construct: {
            marker: function (t, e, i) {
                return this.defs().marker(t, e, i)
            }
        }
    }), m.extend(m.Defs, {
        marker: function (t, e, i) {
            return this.put(new m.Marker).size(t, e).ref(t / 2, e / 2).viewbox(0, 0, t, e).attr("orient", "auto").update(i)
        }
    }), m.extend(m.Line, m.Polyline, m.Polygon, m.Path, {
        marker: function (t, e, i, n) {
            var r = ["marker"];
            return "all" != t && r.push(t), r = r.join("-"), t = arguments[1]instanceof m.Marker ? arguments[1] : this.doc().marker(e, i, n), this.attr(r, t)
        }
    });
    var x = {
        stroke: ["color", "width", "opacity", "linecap", "linejoin", "miterlimit", "dasharray", "dashoffset"],
        fill: ["color", "opacity", "rule"],
        prefix: function (t, e) {
            return "color" == e ? t : t + "-" + e
        }
    };
    ["fill", "stroke"].forEach(function (t) {
        var e, i = {};
        i[t] = function (i) {
            if ("string" == typeof i || m.Color.isRgb(i) || i && "function" == typeof i.fill)this.attr(t, i); else for (e = x[t].length - 1; e >= 0; e--)null != i[x[t][e]] && this.attr(x.prefix(t, x[t][e]), i[x[t][e]]);
            return this
        }, m.extend(m.Element, m.FX, i)
    }), m.extend(m.Element, m.FX, {
        rotate: function (t, e, i) {
            return this.transform({rotation: t, cx: e, cy: i})
        }, skew: function (t, e, i, n) {
            return this.transform({skewX: t, skewY: e, cx: i, cy: n})
        }, scale: function (t, e, i, n) {
            return 1 == arguments.length || 3 == arguments.length ? this.transform({
                scale: t,
                cx: e,
                cy: i
            }) : this.transform({scaleX: t, scaleY: e, cx: i, cy: n})
        }, translate: function (t, e) {
            return this.transform({x: t, y: e})
        }, flip: function (t, e) {
            return this.transform({flip: t, offset: e})
        }, matrix: function (t) {
            return this.attr("transform", new m.Matrix(t))
        }, opacity: function (t) {
            return this.attr("opacity", t)
        }, dx: function (t) {
            return this.x((this.target || this).x() + t)
        }, dy: function (t) {
            return this.y((this.target || this).y() + t)
        }, dmove: function (t, e) {
            return this.dx(t).dy(e)
        }
    }), m.extend(m.Rect, m.Ellipse, m.Circle, m.Gradient, m.FX, {
        radius: function (t, e) {
            return "radial" == (this.target || this).type ? this.attr({r: new m.Number(t)}) : this.rx(t).ry(null == e ? t : e)
        }
    }), m.extend(m.Path, {
        length: function () {
            return this.node.getTotalLength()
        }, pointAt: function (t) {
            return this.node.getPointAtLength(t)
        }
    }), m.extend(m.Parent, m.Text, m.FX, {
        font: function (t) {
            for (var e in t)"leading" == e ? this.leading(t[e]) : "anchor" == e ? this.attr("text-anchor", t[e]) : "size" == e || "family" == e || "weight" == e || "stretch" == e || "variant" == e || "style" == e ? this.attr("font-" + e, t[e]) : this.attr(e, t[e]);
            return this
        }
    }), m.Set = m.invent({
        create: function (t) {
            Array.isArray(t) ? this.members = t : this.clear()
        }, extend: {
            add: function () {
                var t, e, i = [].slice.call(arguments);
                for (t = 0, e = i.length; e > t; t++)this.members.push(i[t]);
                return this
            }, remove: function (t) {
                var e = this.index(t);
                return e > -1 && this.members.splice(e, 1), this
            }, each: function (t) {
                for (var e = 0, i = this.members.length; i > e; e++)t.apply(this.members[e], [e, this.members]);
                return this
            }, clear: function () {
                return this.members = [], this
            }, length: function () {
                return this.members.length
            }, has: function (t) {
                return this.index(t) >= 0
            }, index: function (t) {
                return this.members.indexOf(t)
            }, get: function (t) {
                return this.members[t]
            }, first: function () {
                return this.get(0)
            }, last: function () {
                return this.get(this.members.length - 1)
            }, valueOf: function () {
                return this.members
            }, bbox: function () {
                var t = new m.BBox;
                if (0 == this.members.length)return t;
                var e = this.members[0].rbox();
                return t.x = e.x, t.y = e.y, t.width = e.width, t.height = e.height, this.each(function () {
                    t = t.merge(this.rbox())
                }), t
            }
        }, construct: {
            set: function (t) {
                return new m.Set(t)
            }
        }
    }), m.FX.Set = m.invent({
        create: function (t) {
            this.set = t
        }
    }), m.Set.inherit = function () {
        var t, e = [];
        for (var t in m.Shape.prototype)"function" == typeof m.Shape.prototype[t] && "function" != typeof m.Set.prototype[t] && e.push(t);
        e.forEach(function (t) {
            m.Set.prototype[t] = function () {
                for (var e = 0, i = this.members.length; i > e; e++)this.members[e] && "function" == typeof this.members[e][t] && this.members[e][t].apply(this.members[e], arguments);
                return "animate" == t ? this.fx || (this.fx = new m.FX.Set(this)) : this
            }
        }), e = [];
        for (var t in m.FX.prototype)"function" == typeof m.FX.prototype[t] && "function" != typeof m.FX.Set.prototype[t] && e.push(t);
        e.forEach(function (t) {
            m.FX.Set.prototype[t] = function () {
                for (var e = 0, i = this.set.members.length; i > e; e++)this.set.members[e].fx[t].apply(this.set.members[e].fx, arguments);
                return this
            }
        })
    }, m.extend(m.Element, {
        data: function (t, e, i) {
            if ("object" == typeof t)for (e in t)this.data(e, t[e]); else if (arguments.length < 2)try {
                return JSON.parse(this.attr("data-" + t))
            } catch (n) {
                return this.attr("data-" + t)
            } else this.attr("data-" + t, null === e ? null : i === !0 || "string" == typeof e || "number" == typeof e ? e : JSON.stringify(e));
            return this
        }
    }), m.extend(m.Element, {
        remember: function (t, e) {
            if ("object" == typeof arguments[0])for (var e in t)this.remember(e, t[e]); else {
                if (1 == arguments.length)return this.memory()[t];
                this.memory()[t] = e
            }
            return this
        }, forget: function () {
            if (0 == arguments.length)this._memory = {}; else for (var t = arguments.length - 1; t >= 0; t--)delete this.memory()[arguments[t]];
            return this
        }, memory: function () {
            return this._memory || (this._memory = {})
        }
    }), m.get = function (t) {
        var e = document.getElementById(p(t) || t);
        return e ? m.adopt(e) : void 0
    }, m.select = function (t, e) {
        return new m.Set(m.utils.map((e || document).querySelectorAll(t), function (t) {
            return m.adopt(t)
        }))
    }, m.extend(m.Parent, {
        select: function (t) {
            return m.select(t, this.node)
        }
    });
    var g = "abcdef".split("");
    if ("function" != typeof y) {
        var y = function (t, e) {
            e = e || {bubbles: !1, cancelable: !1, detail: void 0};
            var i = document.createEvent("CustomEvent");
            return i.initCustomEvent(t, e.bubbles, e.cancelable, e.detail), i
        };
        y.prototype = window.Event.prototype, window.CustomEvent = y
    }
    return function (t) {
        for (var e = 0, i = ["moz", "webkit"], n = 0; n < i.length && !window.requestAnimationFrame; ++n)t.requestAnimationFrame = t[i[n] + "RequestAnimationFrame"], t.cancelAnimationFrame = t[i[n] + "CancelAnimationFrame"] || t[i[n] + "CancelRequestAnimationFrame"];
        t.requestAnimationFrame = t.requestAnimationFrame || function (i) {
                var n = (new Date).getTime(), r = Math.max(0, 16 - (n - e)), s = t.setTimeout(function () {
                    i(n + r)
                }, r);
                return e = n + r, s
            }, t.cancelAnimationFrame = t.cancelAnimationFrame || t.clearTimeout
    }(window), m
});
