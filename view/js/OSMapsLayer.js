OSMapsLayer = OpenLayers.Class(OpenLayers.Layer.OSM, {

    initialize: function(name) {
        
        OpenLayers.Layer.OSM.prototype.initialize.apply(this, [name]);
        this.transitionEffect = 'resize';
    }
});