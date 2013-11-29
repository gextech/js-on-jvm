module.exports = (grunt) ->
  grunt.initConfig
    browserify:
      dist:
        files:
          'generated/main.js': ['app/*.coffee']
        options:
          alias: ["app/animal.coffee:animal"]
          transform: ['coffeeify']


  grunt.loadNpmTasks 'grunt-browserify'
  grunt.registerTask "default", ["browserify"]