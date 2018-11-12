module.exports = function(grunt) {
grunt.initConfig({
  madge: {
	options: {
	  format: 'amd'
	},
	all: ['src/main/webapp/res/js']
  }
});

  grunt.loadNpmTasks('grunt-madge');
  grunt.registerTask('default', ['madge']);
};