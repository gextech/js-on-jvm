require=(function e(t,n,r){function s(o,u){if(!n[o]){if(!t[o]){var a=typeof require=="function"&&require;if(!u&&a)return a(o,!0);if(i)return i(o,!0);throw new Error("Cannot find module '"+o+"'")}var f=n[o]={exports:{}};t[o][0].call(f.exports,function(e){var n=t[o][1][e];return s(n?n:e)},f,f.exports,e,t,n,r)}return n[o].exports}var i=typeof require=="function"&&require;for(var o=0;o<r.length;o++)s(r[o]);return s})({"nMlNaY":[function(require,module,exports){
var Animal;

module.exports = Animal = (function() {
  function Animal() {}

  Animal.prototype.move = function(arg) {
    var msg;
    msg = "Animals can move, " + arg;
    return msg;
  };

  return Animal;

})();


},{}],"animal":[function(require,module,exports){
module.exports=require('nMlNaY');
},{}],3:[function(require,module,exports){
var Animal, move;

Animal = require("./animal.coffee");

move = function() {
  var animal;
  animal = new Animal();
  return animal.move();
};


},{"./animal.coffee":"nMlNaY"}]},{},["nMlNaY",3])