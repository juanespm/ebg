ClickHandler = OpenLayers.Class(OpenLayers.Control, {
//    lonInput : null,
//    latInput : null,
    map : null,
    callback : null,
    
    defaultHandlerOptions : {
        'single' : true,
        'double' : false,
        'pixelTolerance' : 0,
        'stopSingle' : false,
        'stopDouble' : false
    },

    initialize : function(callbackFunc, mapObj/*lonInputId, latInputId*/) {
        this.handlerOptions = OpenLayers.Util.extend({},
                this.defaultHandlerOptions);
        OpenLayers.Control.prototype.initialize.apply(this, arguments);
        this.handler = new OpenLayers.Handler.Click(this, {
            'click' : this.trigger
        }, this.handlerOptions);
//        this.lonInput = $jq("#" + lonInputId);
//        this.latInput = $jq("#" + latInputId);
        this.callback = callbackFunc;
        this.map = mapObj;
    },

    trigger : function(e) {
        var lonlat = this.map.getLonLatFromPixel(e.xy);
        
//        lonlat.transform(new OpenLayers.Projection("EPSG:4326"),
//        new OpenLayers.Projection("EPSG:900913"));
        
//        this.lonInput.value(lonlat.lon);
//        this.latInput.value(lonlat.lat);
        this.callback(lonlat.lon, lonlat.lat);
    }

});