# Project Name

clj-marta is a very thin wrapper around the [MARTA APIs](http://www.itsmarta.com/app-developer-resources.aspx).


## Project Goals

### TODO
 - [x] Find rail schedule by line
 - [x] Find rail schedule by station
 - [x] Find bus schedule by stop
 - [x] Find bus stop by route
 - [ ] Find routes by stop
 - [ ] Add projected arrival/departure time based on historical trends

## Project Maturity

clj-marta is *very* young.


## Artifacts

... artifacts are [released to Clojars](https://clojars.org/itg/clj-marta). If you are using Maven, add the following repository
definition to your `pom.xml`:

``` xml
<repository>
  <id>clojars.org</id>
  <url>http://clojars.org/repo</url>
</repository>
```

### The Most Recent Release

With Leiningen:

    [itg/clj-marta "1.0.0-alpha1"]


With Maven:

    <dependency>
      <groupId>itg</groupId>
      <artifactId>clj-marta</artifactId>
      <version>1.0.0-alpha1</version>
    </dependency>


## Documentation & Examples

Our documentation site is not yet live, sorry.


## Supported Clojure versions

clj-marta is built from the ground up for Clojure 1.8.0 and up.


## Continuous Integration Status

[![Continuous Integration status](https://secure.travis-ci.org/itg/clj-marta.png)](http://travis-ci.org/itg/clj-marta)

## Development

clj-marta uses [Leiningen
2](https://github.com/technomancy/leiningen/blob/master/doc/TUTORIAL.md). Make
sure you have it installed and then run tests against supported
Clojure versions using

    lein all test

Then create a branch and make your changes on it. Once you are done
with your changes and all tests pass, submit a pull request on GitHub.



## License

clj-marta is licensed under the [MIT license](https://opensource.org/licenses/MIT).
