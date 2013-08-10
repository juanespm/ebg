BlockStyle = OpenLayers.Class(OpenLayers.Style, {

    initialize: function() {        
        OpenLayers.Style.prototype.initialize.apply(this, [{
            strokeColor : "#3399ff",
            strokeWidth : 0,
            strokeOpacity : 0.5,
            fillOpacity : 0.25,
            fillColor : "#66ccff"
        }]);
    }
});

PavilionStyle = OpenLayers.Class(OpenLayers.Style, {

    initialize: function() {        
        OpenLayers.Style.prototype.initialize.apply(this, [{
            strokeColor : "#ff9933",
            strokeWidth : 0,
            strokeOpacity : 0.5,
            fillOpacity : 0.25,
            fillColor : "#ffcc66"
        }]);
    }
});

FlyerIconStyle = OpenLayers.Class(OpenLayers.Style, {

    initialize: function() {        
        OpenLayers.Style.prototype.initialize.apply(this, [{
            externalGraphic : 'img/megaphone.png',
            graphicWidth : 20,
            graphicHeight : 20
        }]);
    }
});

LocationIconStyle = OpenLayers.Class(OpenLayers.Style, {

    initialize: function() {        
        OpenLayers.Style.prototype.initialize.apply(this, [{
            externalGraphic : 'img/flag.png',
            graphicWidth : 20,
            graphicHeight : 20
        }]);
    }
});

AndroidIconStyle = OpenLayers.Class(OpenLayers.Style, {

    initialize: function() {        
        OpenLayers.Style.prototype.initialize.apply(this, [{
            externalGraphic : 'img/android.gif',
            graphicWidth : 20,
            graphicHeight : 20
        }]);
    }
});