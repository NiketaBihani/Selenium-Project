let actionspage = require('../pages/actionspage');

describe('actions test', function () {

    it('actions test', function () {

        homepage.get('https://juliemr.github.io/protractor-demo/');
        homepage.enterFirstNumber('100');
        homepage.enterSecondNumber('200');
        homepage.clickGo();
        homepage.enterFirstNumber('200');
        homepage.enterSecondNumber('300');
        homepage.clickGo();
        homepage.verifyResult();
        browser.sleep(3000);

    });
});


