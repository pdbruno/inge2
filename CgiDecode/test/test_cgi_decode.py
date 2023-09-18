#!./venv/bin/python
import unittest
from src.cgi_decode import cgi_decode


class TestCgiDecode(unittest.TestCase):
    def testIdentity(self):
        res = cgi_decode("Hello World")
        self.assertEqual(res, "Hello World")

    def testPlusCharacter(self):
        res = cgi_decode("Hello + World")
        self.assertEqual(res, "Hello   World")

    def testValidHexa(self):
        res = cgi_decode("Hello %0A World")
        self.assertEqual(res, "Hello \n World")

    def testInvalidLow(self):
        self.assertRaises(ValueError, cgi_decode, "Hello %QA World")

    def testInvalidHigh(self):
        self.assertRaises(ValueError, cgi_decode, "Hello %AQ World")
    