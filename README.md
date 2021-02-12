# Sky Technical Test – API Automation

The aim of this test is to showcase your knowledge of working on an existing automation project.

We have recently built a Ruby-based API that needs testing. The `api` directory contains the source of the API.

Your mission is to test the API, find bugs and fix the Gauge automated tests so you could report back with your findings and the team will be aware of any issues.

Please try to complete as much as you can within `2-3 hours`, we're not looking for everything to be fully done.

The more interesting thing is seeing how you approach this, what your thought process is, how well you can interpret code, and also your source code management abilities.

## Setup

### Pre-requisites

Please make sure you have the following dependencies setup:

- Maven
- Java 8+
- Gauge - <https://docs.gauge.org/master/installation.html>
  - Once Gauge is installed, the `java` and `html-report` plugins will also need to be installed.
  - From cmd line/terminal run: `gauge install html-report java`
- Docker and Docker compose - Go to https://www.docker.com/get-started for installation instructions

## Tasks

### `Part 0` - Run API locally

The app can be run locally either using the `docker-compose.yml` or running the rails app directly on your machine.

#### Docker/Compose (Recommended)

```bash
docker-compose build
docker-compose up
```

The application should now be running on <http://localhost:3000> which you can navigate to in your browser.

#### Rails

Make sure you have latest ruby installed.

```bash
cd api
gem install bundler # To install bundle
bundle install # To install all dependencies
rails server # To start the app.
```

The application will start running locally on port `3000`.

### `Part 1` - Explore the API documentation

- Create a new file `FINDINGS.md`.
- Explore the documentation for each available route, spot any issues and document what will need to be amended with a severity order.

### `Part 2` - Explore the API endpoints

Explore the API using your favourite API tool, be in `Postman`, `cURL` or `Insomnia`.

- Document your findings in the same file created ealier.

### `Part 3.1` - Setup Gauge Environment

If you haven't used Gauge before, we recommend reading the official documentation at `https://docs.gauge.org`.

- The project is built using Maven. Once you have `Gauge` and `Maven` installed on your machine, import the project into your favourite IDE `(IntelliJ/Eclipse)`.

### `Part 3.2` - Run the Tests

The testers have merged in some changes to the project and it's now failing to compile.

- Spot the issue and fix the compilation error

#### Running the Tests

```sh
mvn clean test # will run all of the tests.
mvn gauge:execute -DspecsDir=specs -Dtags=made_up # will run tests with a tag `made_up`.
```

To learn more about the `gauge-maven-plugin` refer to `https://github.com/getgauge-contrib/gauge-maven-plugin/blob/master/README.md`

### `Part 4` - Gauge Tests

The testers have worked on some API tests in Gauge Java however, they haven’t yet finished them and some are failing.
The scenarios are written in Gauge's spec files under the `specs/` directory.

Go through the specifications and help the testers by fixing broken tests and adding any missing steps.

Is there anything that can be improved in the tests? Now is the time to make the tests shine!

### `Part 5` - Improvements

How else would you test this API? Document your findings in the same file as above.

## Submission

Read the `SUBMISSION.md` file for instructions.
